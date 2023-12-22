import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String a = input.next();
		String b = input.next();

		int ai = Integer.parseInt(a);
		int bi = Integer.parseInt(b);

		if(ai < bi){
			System.out.println("a < b");
		}else if (ai == bi){
			System.out.println("a == b");
		}else{
			System.out.println("a > b");
		}
	}
}