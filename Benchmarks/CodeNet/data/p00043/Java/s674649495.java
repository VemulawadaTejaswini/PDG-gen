import java.util.Scanner;
import java.util.Arrays;
public class Main {
    static boolean[] ok;
    static int n;
    public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	int[] num = new int[10];
	ok = new boolean[10];
	String line;
	int index;
	while (scan.hasNext()) {
	    Arrays.fill(num, 0);
	    Arrays.fill(ok, false);
	    line = scan.nextLine();
	    for (int i = 0; i < 13; i++) {
		index = Integer.parseInt(line.substring(i, i + 1));
		num[index]++;
	    }
	    for (int i = 1; i < 10; i++) {
		n = i;
		if (num[i] >= 4) {
		    continue;
		}
		num[i] += 1;
		for (int j = 1; j < 10; j++) {
		    if (num[j] >= 2) {
			num[j] -= 2;
			isPuzzle(num);
			num[j] += 2;
		    }
		}
		num[i] -= 1;
	    }
	    
	    boolean empty = true;
	    for (int i = 1; i < 10; i++) {
		if (ok[i] == true) {
		    System.out.print(i + " ");
		    empty = false;
		}
	    }
	    if (empty == true) {
		System.out.print(0);
	    }
	    System.out.println();
	}
    }
    public static void isPuzzle (int[] num) {
	if (isAllZero(num)) {
	    ok[n] = true;
	    return;
        }
	for (int i = 1; i < 10; i++) {
	    if (num[i] >= 3) {
		num[i] -= 3;
		isPuzzle(num);
		num[i] += 3;
	    }
	}
	for (int i = 1; i < 8; i++) {
	    if (num[i] > 0 && num[i + 1] > 0 && num[i + 2] > 0) {
		num[i] -= 1;
		num[i + 1] -= 1;
		num[i + 2] -= 1;
		isPuzzle(num);
		num[i] += 1;
		num[i + 1] += 1;
		num[i + 2] += 1;
	    }
	}
    }

    public static boolean isAllZero (int[] num) {
	for (int i = 1; i < 10; i++) {
	    if (num[i] > 0) {
		return false;
	    }
	}
	return true;
    }
}