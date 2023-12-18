import java.util.Scanner;
public class Main {
	public static void main(String[]args){
		Scanner s =new Scanner(System.in);
		int a =s.nextInt();
		int b =s.nextInt();

		System.out.println(Integer.toString(a/b)+" "+Integer.toString(a%b)+" "+Float.toString((float)a/(float)b));
	}
}