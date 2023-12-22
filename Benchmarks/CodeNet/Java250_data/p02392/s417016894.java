import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String a = input.next();
		String b = input.next();
		String c = input.next();

		int ai = Integer.parseInt(a);
		int bi = Integer.parseInt(b);
		int ci = Integer.parseInt(c);

		if(ai < bi && bi < ci){
			System.out.println("Yes");
		}else{
			System.out.println("No");

		}
	}
}