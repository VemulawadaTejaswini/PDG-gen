import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		//Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		for(int i = 0; i<N; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		if(N == 1){
			System.out.println(arr[0]/2);
			System.exit(0);
		}
		
		long total = 0;
		for(int i = 1; i<N; i++){
			int sum = arr[i-1] + arr[i];
			if(sum%2==0){
				//even
				total += sum/2;
				arr[i-1] = 0;
				arr[i] = 0;
			}
			else{
				//odd
				total += sum/2;
				if(arr[i]>0){
					arr[i] = 1;
					arr[i-1] = 0;
				}
				else{
					arr[i-1] = 1;
					arr[i] = 0;
				}
			}
		}
		System.out.println(total);
	}
}