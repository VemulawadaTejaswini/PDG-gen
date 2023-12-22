import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++){
			char[] x = sc.next().toCharArray();
			char[] y = new char[8];
			
			Arrays.sort(x);
			
			for(int j = 0; j < 8; j++)
				y[j] = x[7 - j];
			
			int max = Integer.parseInt(String.valueOf(y));
			int min = Integer.parseInt(String.valueOf(x));
			
			System.out.println(max - min);
		}
		sc.close();
	}
}