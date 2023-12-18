import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		if(x <= 599){
			System.out.println(8);
		}else if(x <= 799){
			System.out.println(7);
		}else if(x <= 999){
			System.out.println(6);
		}else if(x <= 1199){
			System.out.println(5);
		}else if(x <= 1399){
			System.out.println(4);
		}else if(x <= 1599){
			System.out.println(3);
		}else if(x <= 1799){
			System.out.println(2);
		}else {
			System.out.println(1);
		}
		
		

	}

}