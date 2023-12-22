import java.util.Scanner;

class Main {
    public static void main(String[] av) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();

	if (a < b) {
	    int tmp = a;
	    a = b;
	    b = tmp;
	}

	int r = a%b;
	while (r != 0) {
	    a = b;
	    b = r;
	    r = a%b;
	}
	System.out.println(b);
    }
}
