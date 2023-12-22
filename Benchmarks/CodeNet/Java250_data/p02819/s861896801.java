import java.util.Scanner;

class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int X = sc.nextInt();
	int i, j;

	for (i = X; ; i++) {
	    for (j = 2; j * j <= X; j++) {
		if (i % j == 0) {
		    break;
		}
	    }

	    if (j * j > i) {
		break;
	    }
	}

	System.out.println(i);
    }
}