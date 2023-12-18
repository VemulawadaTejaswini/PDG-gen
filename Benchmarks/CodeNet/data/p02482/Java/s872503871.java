import java.util.Scanner;

public class Main{
	public static void main(String[] args){

		Scanner inte = new Scanner(System.in);
		int a = inte.nextInt();
		int b = inte.nextInt();

		if(a < b){
			System.out.println("a<b");
		}else if(a > b){
			System.out.println("a>b");
		}else{
			System.out.println("a==b");
		}
	}
}