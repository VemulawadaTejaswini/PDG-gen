import java.util.Scanner;

class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int N = sc.nextInt();
	char c[] = (sc.next()).toCharArray();

	char ABC[] = {'A', 'B', 'C'};
	int count = 0;
	int j = 0;
	for (int i = 0; i < N; i++) {
	    if (c[i] == ABC[j]) {
		j++;
	    } else {
		if (c[i] == 'A') {
		    j = 1;
		} else {
		    j = 0;
		}
	    }

	    if (j == 3) {
		j = 0;
		count++;
	    }
	}

	System.out.println(count);
    }
}