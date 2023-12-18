import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		int a = reader.nextInt();
		int b = reader.nextInt();
		if(a < b){
			System.out.println("a < b");
		} else if (a > b){
			System.out.println("a > b");
		} else{System.out.println("a == b");}
	}
}