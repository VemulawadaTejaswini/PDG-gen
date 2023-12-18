import java.util.*;

class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a, b, ans = 0;
	char op;

	while (true) {
	    String[] line = sc.nextLine().split(" ");
	    a = Integer.parseInt(line[0]);
	    op = line[1].charAt(0);
	    b = Integer.parseInt(line[2]);
	    if (op == '?') break;

	    switch (op) {
	    case '+':
		ans = a + b;
		break;
	    case '-':
		ans = a - b;
		break;
	    case '*':
		ans = a * b;
		break;
	    case '/':
		ans = a / b;
		break;
	    }
	    System.out.println(ans);
	}
    }
}