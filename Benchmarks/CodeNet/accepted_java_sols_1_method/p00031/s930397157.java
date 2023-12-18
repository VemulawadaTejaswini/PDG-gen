import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
	Scanner scan = new Scanner (System.in);
	int weight, index;
	boolean[] isBinaryNum = new boolean[10];
	int[] binaryNum = new int[10];
	binaryNum[0] = 1;
	for (int i = 1; i < 10; i++) {
	    binaryNum[i] = binaryNum[i-1] * 2;
	}
	StringBuilder sb = new StringBuilder();
	while (scan.hasNext()) {
	    weight = Integer.parseInt(scan.nextLine());
	    index = 0;
	    sb.setLength(0);
	    for (int i = 0; i < 10; i++) {
		isBinaryNum[i] = false;
	    }
	    while (weight != 0) {
		if (weight % 2 == 1) {
		    isBinaryNum[index] = true;
		}
		weight /= 2;
		index++;
	    }
	    for (int i = 0; i < 10; i++) {
		if (isBinaryNum[i]) {
		    sb.append(binaryNum[i] + " ");
		}
	    }
	    System.out.println(sb.toString().trim());
	}
    }
}