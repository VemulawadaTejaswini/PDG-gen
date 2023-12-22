import java.util.Scanner;

class Main {
    public static void main (String args[]) {
	Scanner scan = new Scanner(System.in);
	scan.useDelimiter(",|\n");
	int n = scan.nextInt();
	int m = scan.nextInt();
	int[] seq = new int[n];

	for (int i=0; i<n; i++) {
	    seq[i] = i+1;
	}

        for (int i=0; i<m; i++) {
	    int a = scan.nextInt() - 1;
	    int b = scan.nextInt() - 1;
	    
	    int tmp = seq[a];
	    seq[a] = seq[b];
	    seq[b] = tmp;
	}

	for (int data: seq) {
	    System.out.println(data);
	}
    }
}