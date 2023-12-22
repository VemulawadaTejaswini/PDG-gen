import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new java.util.Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		if(A<=8 && B<=8) {
			System.out.print("Yay!");
		}else {
			System.out.print(":(");
		}
		in.close();
		
	}
}