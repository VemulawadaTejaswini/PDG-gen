import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n+1];
		for(int i=1;i<=n;i++){
			a[i] = sc.nextInt();
		}
		sc.close();
		int[] score = new int[n+1];
		for(int i=k;i<=n;i++){
			score[i] = 1;
			for(int j = (i-k+1);j<=i;j++){
				score[i] *= a[j];
			}
		}

		for(int i=k+1;i<=n;i++){
			if(score[i] > score[i-1]){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}

	}
}
