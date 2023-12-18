import java.util.Scanner;

class Main {

    static Scanner scan;

    public static void main(String[] args) {
	scan = new Scanner(System.in);

	int[] in = new int[5];
	for(int i = 0; i < in.length; i++) {
	    in[i] = scan.nextInt();
	}

	if ((in[4] <= in[2]) &&
	    (in[2] <= in[0]-in[4]) &&
	    (in[4] <= in[3]) &&
	    (in[3] <= in[1]-in[4])) {
	    System.out.println("Yes");
	} else {
	    System.out.println("No");
	}
    }
}

