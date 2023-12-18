import java.math.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    List<UnionFind<Integer>> list = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      list.add(new UnionFind<>(i));
    }
    for (int i = 0; i < m; i++) {
      int a = sc.nextInt() - 1;
      int b = sc.nextInt() - 1;
      UnionFind.union(list.get(a), list.get(b), Math::min);
    }
    Set<Integer> set = list.stream().map(UnionFind::getGroupValue).collect(Collectors.toSet());
    System.out.println(set.size() - 1);
  }
}

/**
 * Union Find
 * @param <T> 値の型
 */
class UnionFind<T> {
  /** 親 (なければnull) */
  private UnionFind<T> parent;
  /** 値 */
  private final T value;
  /** 所属するグループの合算した値 (root要素以外のgroupValueは正しいとは限らない) */
  private T groupValue;

  /**
   * Union Find
   * @param value 値
   */
  public UnionFind(T value) {
    this.value = value;
    this.groupValue = value;
  }

  /**
   * 同じグループに属するかどうか
   * @param a a
   * @param b b
   * @param <S> 値の型
   * @return 同じグループに属するならtrue
   */
  public static <S> boolean sameGroup(UnionFind<S> a, UnionFind<S> b) {
    return a.getRoot().equals(b.getRoot());
  }

  /**
   * 同じ木に所属させる
   * @param a a
   * @param b b
   * @param <S> 値の型
   */
  public static <S> void union(UnionFind<S> a, UnionFind<S> b) {
    union(a, b, (_1, _2) -> _1);
  }
  /**
   * 同じ木に所属させる。また、値の計算もする
   * @param a a
   * @param b b
   * @param groupValueFunction aとbが異なるグループに属するとき、その2つのグループの値を合算する関数。
   * @param <S> 値の型
   */
  public static <S> void union(UnionFind<S> a, UnionFind<S> b, BiFunction<S, S, S> groupValueFunction) {
    UnionFind<S> aRoot = a.getRoot();
    UnionFind<S> bRoot = b.getRoot();
    if (!aRoot.equals(bRoot)) {
      bRoot.parent = aRoot;
      aRoot.groupValue = groupValueFunction.apply(aRoot.groupValue, bRoot.groupValue);
    }
  }

  @Override
  public boolean equals(Object o) {
    return this == o;
  }

  /**
   * root要素を返す。
   * @return root要素
   */
  private UnionFind<T> getRoot() {
    if (parent == null) {
      return this;
    }
    UnionFind<T> root = parent.getRoot();
    parent = root;
    return root;
  }

  /**
   * この要素の値を返す。
   * @return 値
   */
  public T getValue() {
    return value;
  }

  /**
   * この要素が属するグループの値を返す。
   * @return グループの値
   */
  public T getGroupValue() {
    return getRoot().groupValue;
  }
}

