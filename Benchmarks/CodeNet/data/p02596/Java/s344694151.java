import java.util.Scanner;
 
public class Main {
   public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
      
      int K = sc.nextInt();
      String S[];
      S = new String[K];
     
      //7,77,777,7777,77777,777777,....一つ前の配列に[7]を足していく
      for(int i=0; i<K; i++) {
        S[i] += "7";
      }
     
      for(int i=0; i<K; i++) {
        //(S[i] % K == 0)なら配列を整数に変換できていない
        if(S[i] % K == 0) {
          System.out.println(i+1);
        } else {
          System.out.println("-1");
        }
      }
   }
}