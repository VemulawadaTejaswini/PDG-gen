import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		int con = 0;
		int div = 0;
			
		do{
			if((num1 + con) % num3 == 0) {
				div++;
			}
			else{}
			con++;
		}while(num1 + con < num2);

		System.out.println(div);
	}
}