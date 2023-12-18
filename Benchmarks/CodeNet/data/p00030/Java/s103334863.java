import java.util.Scanner;
public class Main {
    static int count, sum;
    static int[] num;
    public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	int n;
	String[] input;
	num = new int[10];
	for (int i = 0; i < 10; i++) {
	    num[i] = i;
	}
	while (scan.hasNext()) {
	    input = scan.nextLine().split(" ");
	    n = Integer.parseInt(input[0]);
	    sum = Integer.parseInt(input[1]);
	    if (n == 0 && sum == 0) {
		break;
	    }
	    if (sum > 45) {
		continue;
	    }
	    count = 0;
	    add (0, n, 0);
	    System.out.println(count);
	}
    }
    static void add (int nowSum, int n, int index) {
	if (n < 0 || index > 9 || nowSum > sum) {
	    return;
	}
	if (sum == nowSum && n == 0) {
	    count++;
	    return;
	}
	add (nowSum + num[index], n-1, index+1);
	add (nowSum, n, index+1);
    }
}