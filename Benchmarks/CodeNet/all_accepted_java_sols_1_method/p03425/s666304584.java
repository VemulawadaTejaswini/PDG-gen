import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static void main(String args[]) throws IOException{
		Scanner sc = new Scanner(System.in);
		
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer st = new StringTokenizer(br.readLine());
		
		//StringBuilder sb = new StringBuilder();
		
		int n = sc.nextInt();
		
		int arr[] = new int[5];
		
		for(int i=0;i<n;i++){
			char c = sc.next().charAt(0);
			switch(c){
			case 'M':
				arr[0]++;
				break;
			case 'A':
				arr[1]++;
				break;
			case 'R':
				arr[2]++;
				break;
			case 'C':
				arr[3]++;
				break;
			case 'H':
				arr[4]++;
				break;
			}
		}
		
		long ans = 0;
		for(int i=0;i<5;i++){
			for(int j=i+1;j<5;j++){
				for(int k=j+1;k<5;k++){
					ans += (long)arr[i]*arr[j]*arr[k];
				}
			}
		}
		System.out.println(ans);
	}
}