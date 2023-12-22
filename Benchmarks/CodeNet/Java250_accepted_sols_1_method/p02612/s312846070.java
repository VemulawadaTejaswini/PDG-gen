import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		
		Scanner in = new java.util.Scanner(System.in);
		int n = in.nextInt();
		int m = n%1000;
		if(m == 0) {
			System.out.println(0);
		}else {
			System.out.println(1000 - m);
		}
		
		
		in.close();
	}
}
