import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		float f=0;
		
		int r = a/2;
		f= 1-(float)r/(float)a;
		System.out.println(f);

	}
}
