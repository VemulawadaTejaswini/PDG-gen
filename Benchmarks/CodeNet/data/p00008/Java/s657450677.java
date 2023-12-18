import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	int[] num = new int[51];
	for (int i = 0; i < 10; i++) {
	    for (int j = 0; j < 10; j++) {
		for (int k = 0; k < 10; k++) {
		    for (int l = 0; l < 10; l++) {
			num[i+j+k+l]++;
		    }
		}
	    }
	}
	int n;
	while (scan.hasNext()) {
	    n = Integer.parseInt(scan.nextLine());
	    System.out.println(num[n]);
	}
    }
}