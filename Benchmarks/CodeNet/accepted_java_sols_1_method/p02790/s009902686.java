import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		if(a >= b){
			for(int i = 0; i < a; i++){
				System.out.print(b);
			}
		}
		else{
			for(int i = 0; i < b; i++){
				System.out.print(a);
			}
		}
		stdIn.close();
	}
}
