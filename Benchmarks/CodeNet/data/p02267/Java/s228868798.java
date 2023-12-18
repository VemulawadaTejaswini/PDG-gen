import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int S[] = new int[n];
		int i;
		for(i=0; i<n; i++){
			S[i] = sc.nextInt();
		}
		int q = sc.nextInt();
		int T[] = new int[n];
		int j;
		for(j=0; j<q; j++){
			T[j] = sc.nextInt();
		}
		int C=0;
		for(j=0; j<q; j++){
			for(i=0; i<n; i++){
				if(T[j]==S[i]){
					C++;
					break;
				}
			}
		}
		System.out.println(C);
	}
}