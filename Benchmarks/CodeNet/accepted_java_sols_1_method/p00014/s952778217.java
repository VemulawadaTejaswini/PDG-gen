import java.util.Scanner;

class Main {
    public static void main (String args[]) {
	Scanner scan = new Scanner(System.in);

	while (scan.hasNext()) {
	    int n = scan.nextInt();
	    int S = 0;

	    for (int i=0; i<600; i+=n) {
		int h = i * i;
		S += (n * h);
	    }
	    
	    System.out.println (S);

	}
    }
}