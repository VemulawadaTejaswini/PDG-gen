import java.util.*;

class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	ArrayList<Integer> num1 = new ArrayList<Integer>(),
             	           num2 = new ArrayList<Integer>();
	int n, tmp, count = 0;

	n = sc.nextInt();
	for (int i = 0; i < n; i++) {
	    tmp = sc.nextInt();
	    num1.add(tmp);
	}
	n = sc.nextInt();
	for (int i = 0; i < n; i++) {
	    tmp = sc.nextInt();
	    num2.add(tmp);
	}

	for (int i = 0; i < n; i++) {
	    tmp = num2.get(i);
	    if (num1.indexOf(tmp) != -1) {
		count++;
	    }
	}

	System.out.println(count);
    }
}