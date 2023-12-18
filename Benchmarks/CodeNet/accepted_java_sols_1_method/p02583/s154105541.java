import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int ans = 0;
		int[] arr = new int[N];
		for(int i=0;i<N;i++){
			arr[i]=scan.nextInt();
		}
		Arrays.sort(arr);
		if(N>=3){
			for(int i=0;i<N-2;i++){
				for(int j=i+1;j<N-1;j++){
					for(int k=j+1;k<N;k++){
						if(arr[i]!=arr[j] && arr[k]!=arr[j] && arr[i]+arr[j]>arr[k]){
							ans++;
						}
					}
				}
			}
		}
		System.out.println(ans);
	}
}