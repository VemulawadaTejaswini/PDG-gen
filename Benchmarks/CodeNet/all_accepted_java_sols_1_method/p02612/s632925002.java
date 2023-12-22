import java.util.Scanner;
//import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//
		long a = sc.nextLong();
		long result = a % 1000;
		
		System.out.println(result == 0 ? 0 : 1000 - result);
	}
}
