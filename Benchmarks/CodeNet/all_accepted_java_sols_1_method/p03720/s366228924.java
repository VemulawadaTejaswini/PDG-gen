import java.util.*;	
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int ans[] = new int[n+1];
		int data[] = new int[m*2];
		for(int i= 0;i < m*2;i++) {
			data[i] = sc.nextInt();
		}
		for(int i = 1;i <= n;i++) {
			for(int k = 0;k < m*2;k++) {
				if(data[k] == i)ans[i]++;
			}
		System.out.println(ans[i]);
		}
	}

}
