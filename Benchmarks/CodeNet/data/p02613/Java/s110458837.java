import java.util.Scanner;
 
public class Main {
   public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
     
      //全提出の個数Nを入力
      int N = sc.nextInt();
      //N個分の４種類の配列を入力
      //String S[] = {"AC","WA","TLE","RE"};
      String A = "AC";
      String B = "WA";
      String C = "TLE";
      String D = "RE";
      //出力個数
      //int[] C[] = {0,0,0,0};
      int C0 = 0;
      int C1 = 0;
      int C2 = 0;
      int C3 = 0;
     
      //入力内容から4種類を抽出する
      for(int i=0; i<N; i++) {
       String H = sc.nextLine();
       if(H.equals(A)) {
				C0++;
			}
			else if(H.equals(B)) {
				C1++;
			}
			else if(H.equals(C)) {
				C2++;
			}
			else if(H.equals(D)) {
				C3++;
			}
      }
      //for (int i=0; i<4; i++) {
        //System.out.println(S[i] + "×" + C[i]);
      //}
        System.out.println("AC x " + C0);
		System.out.println("WA x " + C1);
		System.out.println("TLE x " + C2);
		System.out.println("RE x " + C3);
   }
}
