import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		String operator;

		if(a > b){
			operator=">";
		}else if(a < b){
			operator="<";
		}else{
			operator="==";
		}
		System.out.println("a " +operator+ " b");
		scan.close();
	}
}