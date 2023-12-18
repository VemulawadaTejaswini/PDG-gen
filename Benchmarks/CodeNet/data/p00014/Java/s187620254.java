import java.util.Scanner;

class Main {
    public static void main (String args[]) {
	Scanner scan = new Scanner(System.in);
	int S = 0;

	while (scan.hasNext()) {
	    int n = scan.nextInt();

	    for (int i=0; i<600; i+=n) {
		int h = i * i;
		S += (n * h);
	    }
	    
	    System.out.println (S);

	}
    }
}