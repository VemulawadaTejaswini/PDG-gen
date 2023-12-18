import java.util.*;

// 参考サイト https://qiita.com/malbare932/items/cb942a12d175157134de

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] A = new int[N];

    int b = 0; // A_1からA_Nまでのビット和
 
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
      b = (A[i] | b); 
    }

    sc.close();

    int count = 0;

    while((b & 1) == 0) { // ビット和の最下位ビットが0である限り
      b = b >> 1; // ビット和を1ビットシフトする（= 元の値を1/2倍にする） <-> 左シフト（<<）は元の値を2倍にする
      count++;
    }

    System.out.println(count);
    
  }

}