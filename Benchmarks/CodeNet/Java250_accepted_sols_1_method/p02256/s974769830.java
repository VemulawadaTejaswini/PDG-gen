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
		int temp = 0;

		if(b > a){
			temp = a;
			a = b; 
			b = temp;
		}

		if(a == b){
			System.out.println(b);
		}else{
			while(a % b != 0){
				temp = b;
				b = a % b;
				a = temp;
			}
			System.out.println(b);
		}
		

	}
}