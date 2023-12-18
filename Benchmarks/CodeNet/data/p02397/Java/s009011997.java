import java.util.Scanner;

public class Main {
	public static void main(String args[] ){
		try{
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a == b && a == 0 ){
				return;
			}else if(a>b){
				System.out.println(b + " " + a);
			}else{
				System.out.println(a + " " + b);
			}
		}catch(NumberFormatException e){
			System.out.println("write number");
		}
	}
}