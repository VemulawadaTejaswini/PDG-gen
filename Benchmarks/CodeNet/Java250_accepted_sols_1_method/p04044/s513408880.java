import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int L = scan.nextInt();
		
		String[] moji = new String[N];
		
		for(int i = 0;i<N;i++){
			moji[i] = scan.next();
		}
		
		Arrays.sort(moji);
		
		StringBuilder sb = new StringBuilder();
		
		for(int j = 0;j<N;j++){
			sb.append(moji[j]);
		}
		
		System.out.println(sb.toString());
		
		
		
		
	}

}