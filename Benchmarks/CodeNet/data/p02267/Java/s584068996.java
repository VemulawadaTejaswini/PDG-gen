import java.util.Scanner;

public class Main {
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
			if(S[j] == temp){
				C++;
				break;
			}
		}
	}
	System.out.println(C);
	}
}