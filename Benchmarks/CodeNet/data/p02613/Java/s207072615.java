import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);

    int N = in.nextInt();		// テストケースの個数
    String S[] = new String[N];	// ジャッジ結果を表す文字列	( AC, WA, TLE, RE )
    for(int i=0; i<N; i++)
		S[i] = in.next();
    int C[] = new int[4];			// それぞれのテストケースの個数
    for(int i=0; i<4; i++)
    	C[i] = 0;
    
    for(int i=0; i<N; i++){
		switch (S[i]){
			case "AC":
				C[0]++;
				break;
			case "WA":
				C[1]++;
				break;
			case "TLE":
				C[2]++;
				break;
			case "RE":
				C[3]++;
				break;
		}
    }
    
    System.out.println("AC x " + C[0]);
    System.out.println("WA x " + C[1]);
    System.out.println("TLE x " + C[2]);
    System.out.println("RE x " + C[3]);
  }
}