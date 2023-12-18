import java.util.Scanner;

class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int N = sc.nextInt();
	String S = sc.next();

	String T[] = S.split("");
	boolean bl = true;
	if (N % 2 == 1) {
	    bl = false;
	} else {
	    for (int i = 0; i < N / 2; i++) {
		if (!T[i].equals(T[N / 2 + i]))
		    bl = false;
	    }
	}

	if (bl)
	    System.out.println("Yes");
	else
	    System.out.println("No");
    }
}