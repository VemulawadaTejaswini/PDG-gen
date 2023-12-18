import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
	Scanner scan = new Scanner (System.in);
	String num1, num2;
	int[] a, b;
	int[] c;
	int n = Integer.parseInt(scan.nextLine());
	for (int i = 0; i < n; i++) {
	    num1 = scan.nextLine();
	    num2 = scan.nextLine();
	    if (num1.length() > 80 || num2.length() > 80) {
		System.out.println("overflow");
		continue;
	    }
	    a = convertStringToIntArray(num1);
	    b = convertStringToIntArray(num2);
	    c = add(a, b);
	    if (c[0] != 0) {
		System.out.println("overflow");
	    } else {
		printArray(c);
	    }
	}
    }
    public static int[] convertStringToIntArray (String num) {
	int[] a = new int[80];
	int len = num.length();
	for (int i = 0; i < len; i++) {
	    a[79-i] = Integer.parseInt(num.substring(len-1-i, len-i));
	}
	return a;
    }
    public static int[] add (int[] a, int[] b) {
	int tmp;
	int[] c = new int[81];
	for (int i = 79; i >= 0; i--) {
	    tmp = a[i] + b[i] + c[i+1];
	    if (tmp >= 10) {
		c[i+1] = tmp - 10;
		c[i] += 1;
	    } else {
		c[i+1] = tmp;
	    }
	}
	return c;
    }
    public static void printArray (int[] a) {
	StringBuilder sb = new StringBuilder();
	int start = 0;
	while (a[start] == 0) {
	    start++;
	}
	for (int i = start; i < a.length; i++) {
	    sb.append(a[i]);
	}
	System.out.println(sb);
    }
}