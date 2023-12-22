import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String [] S = new String[N];
		String AC ="AC";
		String WA ="WA";
		String TLE ="TLE";
		String RE ="RE";
		int C0=0;
		int C1=0;
		int C2=0;
		int C3=0;
		if((1<=N)&&(N<=Math.pow(10, 5))) {
		for(int i=0;i<N;i++) {
			S[i] = sc.next();
		}
		
		for(int i=0;i<N;i++) {
			if(S[i].equals(AC)) {
				C0++;
			}else if(S[i].equals(WA)) {
				C1++;
			}else if(S[i].equals(TLE)) {
				C2++;
			}else if(S[i].equals(RE)) {
				C3++;
			}
		}
		}
		System.out.println("AC x "+C0);
		System.out.println("WA x "+C1);
		System.out.println("TLE x "+C2);
		System.out.println("RE x "+C3);
		
		sc.close();
	}

}