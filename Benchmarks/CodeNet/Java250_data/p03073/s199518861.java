import java.util.Scanner;

class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	String S = sc.next();
	String x[] = S.split("");

	int count = 0;
	if (x.length < 2)
	    System.out.println(0);
	else {
	    for (int i = 1; i < x.length; i++) {
		if (x[i - 1].equals(x[i])) {
		    if (x[i].equals("0"))
			x[i] = "1";
		    else if (x[i].equals("1"))
			x[i] = "0";
		    count++;
		}
	    }
	    System.out.println(count);
	}
    }
}