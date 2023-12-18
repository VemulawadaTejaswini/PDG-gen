import java.util.Scanner;
class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		long num,fact=1;
		
		num = scan.nextInt();
		
		while(num > 1){
			fact *= num;
			num--;
		}
		
		System.out.println(fact);
	}
}