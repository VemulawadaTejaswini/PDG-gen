import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] card = new int[2*n];
		for(int i=1;i<=2*n;i++) card[i-1] = i;
		for(int i=0;i<m;i++){
			int k = sc.nextInt();
			if(k == 0){
				int[] tcard = new int[2*n];
				for(int j=0;j<n;j++){
					tcard[2*j] = card[j];
					tcard[2*j + 1] = card[j+n];
				}
				card = tcard;
			}
			else{
				int[] tcard = new int[2*n];
				for(int j=0;j<k;j++) tcard[j+2*n-k] = card[j];
				for(int j=0;j<2*n-k;j++) tcard[j] = card[j+k];
				card = tcard;
			}
		}
		for(int i=0;i<2*n;i++) System.out.println(card[i]);
	}
}