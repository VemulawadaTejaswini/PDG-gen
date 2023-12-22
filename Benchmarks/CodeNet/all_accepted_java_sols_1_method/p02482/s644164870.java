import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int x,y;
		String ope;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		
		if (x == y){
			ope = "==";
		} else if(x < y) {
			ope = "<";
		} else {
			ope = ">";
		}
		
	    System.out.println("a " + ope + " b");
	}
}