import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	String[] input;
	int[] nums = new int[4];
	while (true) {
	    input = scan.nextLine().split(" ");
	    for (int i = 0; i < 4; i++) {
		nums[i] = Integer.parseInt(input[i]);
	    }
	    if (nums[0] == 0 && nums[1] == 0 && nums[2] == 0 && nums[3] == 0) {
		break;
	    }
	    solve(nums);
	}
    }
    
    public static void solve (int[] nums) {
	String[] operator = {"+", "-", "*"};
	int cal1, cal2, cal3, a, b, c, d;
	for (int i = 0; i < 4; i++) {
	    for (int j = 0; j < 4; j++) {
		for (int k = 0; k < 4; k++) {
		    for (int l = 0; l < 4; l++) {
			if (i == j || j == k || k == l || l == i) {
			    continue;
			}
			a = nums[i];
			b = nums[j];
			c = nums[k];
			d = nums[l];
			for (int op1 = 0; op1 < 3; op1++) {
			    for (int op2 = 0; op2 < 3; op2++) {
				for (int op3 = 0; op3 < 3; op3++) {
				    cal1 = cal(cal(a, b, op1), cal(c, d, op2), op3);
				    cal2 = cal(cal(cal(a, b, op1), c, op2), d, op3);
				    cal3 = cal(cal(a, cal(b, c, op1), op2), d, op3);
				    if (cal1 == 10) {
					System.out.printf("(%d %s %d) %s (%d % s %d)\n",
							  a, operator[op1], b, operator[op2], c, operator[op3], d);
					return;
				    }
				    if (cal2 == 10) {
					System.out.printf("((%d %s %d) %s %d) %s %d\n",
							  a, operator[op1], b, operator[op2], c, operator[op3], d);
					return;
				    }
				    if (cal3 == 10) {
					System.out.printf("(%d %s (%d %s %d)) %s %d\n",
							  a, operator[op1], b, operator[op2], c, operator[op3], d);
					return;
				    }
				}
			    }
			}
		    }
		}
	    }
	}
	System.out.println("0");
    }

    public static int cal (int a, int b, int op) {
	if (op == 0) {
	    return a + b;
	} else if (op == 1) {
	    return a - b;
	} else if (op == 2) {
	    return a * b;
	}
	return 0;
    }
}