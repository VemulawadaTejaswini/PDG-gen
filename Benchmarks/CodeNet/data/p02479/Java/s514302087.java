import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		Scanner n = new Scanner(System.in);
		int r;
		r = n.nextInt();
		System.out.println(r*r*Math.PI + " " + 2*r*Math.PI );
	}
}