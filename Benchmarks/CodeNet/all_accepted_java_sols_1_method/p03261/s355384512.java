import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String A[] = new String[N];
    A[0] = sc.next();
    Boolean flag = true;
    
    for(int i=1; i<N; i++) {
      A[i] = sc.next();
      if(!A[i-1].substring(A[i-1].length()-1).equals(A[i].substring(0, 1))) {
        flag = false;
      }
    }
    Set<String> linkedHashSet = new LinkedHashSet<String>();

    // 配列の要素を順にLinkedHashSetオブジェクトへ追加
    for (int j = 0; j < A.length; j++) {
    linkedHashSet.add(A[j]);
    }

    // LinkedHashSetオブジェクトを配列に変換
    Object[] B = linkedHashSet.toArray();
    if(N!=B.length) {
      flag = false;
    }
    
    if(flag) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}