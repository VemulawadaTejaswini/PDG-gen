import java.util.Scanner;

class Main {
    public static void main (String args[]) {
	Scanner scan = new Scanner(System.in);
	int[] box = new int[10];
	int i = 0;

	while (scan.hasNext()) {
	    int n = scan.nextInt();

	    if (n == 0) {
		i--;
		System.out.println(box[i]);
	    }
	    else {
		box[i] = n;
		i++;
	    }
	}
    }
}