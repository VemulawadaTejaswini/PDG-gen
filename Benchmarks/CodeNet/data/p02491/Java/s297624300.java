import java.util.Scanner;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a,b;
	a = sc.nextInt();
	b = sc.nextInt();
	float f,g,h;
	f = (float)a;
	g = (float)b;
	h = (float)f/g;
	System.out.println(a/b+" "+a%b+" "+h);
    }
}