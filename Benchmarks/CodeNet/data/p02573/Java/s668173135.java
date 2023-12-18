import java.math.BigInteger;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    if (m == 0) {
      System.out.println(1);
      return;
    }
    Map<Integer, UnionFind<Integer>> friendSetMap = new HashMap<>();
    for (int i = 1; i <= n; i++) {
      friendSetMap.put(i, new UnionFind<>(1));
    }
    for (int i = 0; i < m; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      UnionFind.union(friendSetMap.get(a), friendSetMap.get(b), Integer::sum);
    }
    int result = 0;
    for (int i = 1; i <= n; i++) {
      Integer value = friendSetMap.get(i).getRoot().getValue();
      if (value > result) {
        result = value;
      }
    }
    System.out.println(result);
  }
}

class UnionFind<T> {
  UnionFind<T> parent;
  private T value;

  public UnionFind(T value) {
    this.value = value;
  }

  public static <S> void union(UnionFind<S> a, UnionFind<S> b, BiFunction<S, S, S> unionMap) {
    UnionFind<S> aRoot = a.getRoot();
    UnionFind<S> bRoot = b.getRoot();
    if (aRoot != bRoot) {
      bRoot.parent = aRoot;
      aRoot.value = unionMap.apply(aRoot.getValue(), bRoot.getValue());
    }
  }

  public T getValue() {
    return value;
  }

  public UnionFind<T> getRoot() {
    if (parent == null) {
      return this;
    }
    UnionFind<T> root = parent.getRoot();
    parent = root;
    return root;
  }
}
