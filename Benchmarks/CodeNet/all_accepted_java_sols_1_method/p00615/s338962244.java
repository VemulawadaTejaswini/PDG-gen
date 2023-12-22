import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String args[]){
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner s = new Scanner(System.in);
		try{
			while(true){
				int n = s.nextInt();
				int m = s.nextInt();
				if(n + m == 0) return;

				int a[] = new int[n + m];
				for(int i = 0; i < n + m; i++){
					a[i] = s.nextInt();
				}

				Arrays.sort(a);
				//print(a);

				int max = a[0];
				for(int i = n+m-2; i >= 0; i--){
					if(max < a[i+1] - a[i]) max = a[i+1] - a[i];
				}

				System.out.println(max);
			}
		}catch(Exception e){
			System.err.println(e);
		}
	}
}