import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class Main{
	public static void main(String[] args)throws Exception{
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		if(a == b){
			System.out.println(c);
		}else if(b == c){
			System.out.println(a);
		}else{
			System.out.println(b);
		}

	}
}