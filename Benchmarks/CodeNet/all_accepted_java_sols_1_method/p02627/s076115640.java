import java.util.Scanner;
//import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Character a = scan.next().charAt(0);
		System.out.println(a.isUpperCase(a) ? "A" : "a");
	}
}
