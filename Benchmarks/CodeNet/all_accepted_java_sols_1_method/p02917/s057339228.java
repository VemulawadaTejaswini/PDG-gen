import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int b[] = new int[n-1];
		int a[] = new int[n];
		int ans = 0;

		for(int i = 0;i<n-1;i++){
			b[i] = sc.nextInt();
		}
		sc.close();

		for(int i = 0;i<n;i++){
			if(i == 0){
				a[i] = b[i];
			}else if(i == n-1) {
				a[i] = b[i-1];
			}else{
				a[i] = Math.min(b[i],b[i-1]);
			}
		}
		for(int i = 0;i<n;i++){
			ans += a[i];
		}

System.out.println(ans);
	}
}
