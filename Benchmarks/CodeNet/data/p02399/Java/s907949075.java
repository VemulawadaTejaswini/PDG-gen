import java.util.Scanner;

class Main {
	static int d;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a,b,d,r;
		double f,x,y;
			a = scanner.nextInt();
			b = scanner.nextInt();
            x=a;
            y=b;
            
            d = a/b;
            r = a%b;
            f = x/y;
            System.out.println(d+" "+r+" "+String.format("%.8f", f));
	}
}
