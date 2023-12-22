import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		scan.close();
		String answer = new String();
		if(a > b)
			answer = "a > b";
		if(a < b)
			answer = "a < b";
		if(a == b)
			answer = "a == b";
		System.out.println(answer);
	}

}