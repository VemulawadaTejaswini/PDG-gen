import java.util.Scanner;

public class Main{

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		char [] num = input.toCharArray();

		if(num[0]==num[2]){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}


}
