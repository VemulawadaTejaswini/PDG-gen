import java.util.Scanner;

class Main {
    public static void main (String args[]) {
	Scanner scan = new Scanner(System.in);
	int N = scan.nextInt(); // the number of data set
	int a, b, c; // length

	for(int i=0; i<N; i++) {
	    a = scan.nextInt();
	    b = scan.nextInt();
	    c = scan.nextInt();

	    a = a*a; b = b*b; c = c*c;

	    if ((a == b+c) || (b == c+a) || (c == a+b)) {
		System.out.println("YES");
	    }
	    else {
		System.out.println("NO");
	    }
	    
	}
    }
}