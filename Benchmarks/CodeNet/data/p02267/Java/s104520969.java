import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
	int C = 0;
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	int[] S = new int[n];
	
	for(int i = 0;i<n;i++){
		S[i] = in.nextInt();
	}
	int q = in.nextInt();
	int[] T = new int[q];
	for(int i = 0;i<q;i++){
		T[i] = in.nextInt();
	}
	
	for(int i = 0;i<q;i++){
		int temp = T[i];
		for(int j = 0;j<n;j++){
			if(S[j] == temp) C++;
		}
	}
	System.out.println(C);
	}
	
//	public static int count2(int[] s,int[] t, int n, int q){
//		int C = 0;
//		for(int i = 0;i<n;i++){
//			int temp = t[i];
//			outside:for(int j = 0;j<q;j++){
//				if(s[j] == temp){
//					C++;
//					break outside;
//				}
//			}
//		}
//		return C;
//	}

}