import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] arr = new long[n];
		long h = (long)Math.pow(10,18);
		//System.out.println(h);
		//int flag =0;
		for(int i=0;i<n;i++){
			arr[i]=sc.nextLong();
			// if(arr[i]==0){
			// 	flag = 1;
			// }
		}
		//if(flag==0){
		Arrays.sort(arr);
		long ans =1;
		for(int i=0;i<n;i++){
			//ans=ans*arr[i];
			if(ans*1.0*arr[i]>1e18){
				System.out.println(-1);
				return;
			}
			ans=ans*arr[i];
		}
		System.out.println(ans>(long)1e18 ? -1:ans);
		//}
		// else{
		// 	System.out.println(0);
		// }
	}
}