
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//String line = br.readLine();
		Scanner scan = new Scanner(System.in);

	int N = scan.nextInt();
	int K = scan.nextInt();
	int X = scan.nextInt();
	int Y = scan.nextInt();
	
	if(N-K>0)
			System.out.println(K*X+(N-K)*Y);
	else
		System.out.println(N*X);
				
	
			
	}
}
