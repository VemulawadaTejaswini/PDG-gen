import java.util.Scanner;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a,b;
	a = sc.nextInt();
	b = sc.nextInt();
	int d = a/b;
	int r = a%b;
	double f,g;
	f = (double)a;
	g = (double)b;
	double h = (double)(f/g);
	System.out.printf("%d %d %.5f\n",d,r,h);
    }
}