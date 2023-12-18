import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n,m;
		n = sc.nextInt();
		m = sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[m];
		int vote[] = new int[n];
		int max = 0;
		int answer = 0;
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
		for(int i=0;i<m;i++){
			b[i] = sc.nextInt();
		}
		for(int i=0;i<m;i++){
			int j = 0;
			while(b[i] < a[j]){
				j++;
			}
			vote[j] ++;
		}
		for(int i=0;i<n;i++){
			if(vote[i] > answer){
				max = vote[i];
				answer = i+1;
			}
		}
		System.out.println(answer);
	}

}