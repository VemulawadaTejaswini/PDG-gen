import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		
		int arr[]=new int[N+1];
		for(int n=1;n<=N;n++)
			arr[n]=in.nextInt();
		
		
		
		int ans = 0;
		for(int n=1;n<=N;n++){
			if(arr[arr[n]]==n){
				arr[n]=0;
				arr[arr[n]]=0;
				ans++;
			}
		}
		System.out.println(ans);
	}

}
