import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		int start = sc.nextInt();
		int output = 0;
		arr[0] = start;
		arr[1] = start;
		runner:for(int i = 1;i<N-1;i++) {
			int BI = sc.nextInt();
			
			if(BI>arr[i]) {
			}else {
				arr[i]=BI;
			}
			try {
				arr[i+1]=BI;
			}catch(Exception e) {
				break runner;
			}
		}
		for(int i = 0;i<N;i++) {
			//System.out.print(arr[i]+" ");
			output+=arr[i];
		}
		System.out.println(output);
	}

}
