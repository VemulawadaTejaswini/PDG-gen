import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		int ones = num % 10;
		if(ones == 3){
			System.out.println("bon");
		}else if(ones == 0 || ones == 1 || ones == 6 || ones == 8){
			System.out.println("pon");
		}else{
			System.out.println("hon");
		}
	}
}