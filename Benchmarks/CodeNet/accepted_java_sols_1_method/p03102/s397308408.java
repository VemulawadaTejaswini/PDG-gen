import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int c = sc.nextInt();
		int[] b = new int[m];
		for(int i = 0; i < m; i++){
			int bi = sc.nextInt();
			b[i] = bi;
		}
		int cnt = 0;
		for(int i = 0; i < n; i++){
			int sum = 0;
			for(int j = 0; j < m; j++){
				int a = sc.nextInt();
				sum += (a*b[j]);
			}
			if(sum + c > 0){
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}