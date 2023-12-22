import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int data[] = new int [n];
		int a,ans = 0;
		for(int i = 0;i < n;i++)data[i]=sc.nextInt();
		for(int i = 0;i < n;i++) {
			for(int j = i+1;j < n;j++) {
				if(data[i] >data[j]) {
					a = data[i];
					data[i] = data[j];
					data[j] = a;
				}
			}
		}
		
		for(int i = n-1;i > n-k-1;i--) {
			ans += data[i];
		}
		System.out.println(ans);
	}

}