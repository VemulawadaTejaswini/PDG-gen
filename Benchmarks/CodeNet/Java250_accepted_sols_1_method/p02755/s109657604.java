import java.util.Scanner;

public class Main {

	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int min = -1;
		
		for(int i = 1; i<=10000;i++){
			if((int)(i*0.08) == a && (int)(i*0.1) == b){
				min = i;
				break;
			}
		}
		
		System.out.println(min);
		
	}
}