import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	//A
	/*
	public static void main(String[] args){
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		System.out.println(Math.min(N*A,B));
	}
	**/

	//B
	public static void main(String[] args){
		int N = sc.nextInt();
		String N2 = String.valueOf(N);
		int range = N2.length();
		int f = 0;
		for(int i = 0; i < range ;i++){
			f += Integer.parseInt(""+N2.charAt(i));
		}
		if(N%f == 0)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
