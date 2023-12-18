import java.util.Scanner;


class Main {
    public static void main(String[] args){
    	Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();

		int d = a / b;
		int r = a % b;
		float f = (float)a / (float)b;

    	System.out.printf("%d %d %10.10f", d, r, f);
    }
}