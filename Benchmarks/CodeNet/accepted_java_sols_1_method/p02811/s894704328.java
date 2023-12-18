import java.util.Scanner;
//import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();
		System.out.println(500 * k >= n ? "Yes" : "No");
	}
}
