import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] arr = String.valueOf(n).toCharArray();
		n= arr[0]=='9'? n-800 : n+800;
		n= arr[1]=='9'? n-80 : n+80;
		n= arr[2]=='9'? n-8 : n+8;
		System.out.println(n);		
	}
}