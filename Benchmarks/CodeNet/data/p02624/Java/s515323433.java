import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] div = new int[n+1];
		for(int i=1;i<=n;i++){
			for(int j=1;j*i<=n;j++){
				div[i*j]++;
			}
		}
		long ans=0;
		for(int i=1;i<=n;i++){
			ans =ans+((long)i*(long)div[i]);
		}
		System.out.println(ans);
	}
	
}