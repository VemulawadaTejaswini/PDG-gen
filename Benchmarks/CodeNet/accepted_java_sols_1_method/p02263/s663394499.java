import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String[] A = scan.nextLine().split(" ");
	
        Stack<Integer> num = new Stack<Integer>();
        int a = 0;
        int b = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i].equals("+")) {
                a = num.pop();
                b = num.pop();
                num.add(b + a);
                continue;
            }
            if (A[i].equals("-")) {
                a = num.pop();
                b = num.pop();
                num.add(b - a);
                continue;
            }
            if (A[i].equals("*")) {
                a = num.pop();
                b = num.pop();
                num.add(b * a);
                continue;
            }
            if (A[i].equals("/")) {
                a = num.pop();
                b = num.pop();
                num.add(b / a);
                continue;
            }
            num.push(Integer.parseInt(A[i]));
        }
        System.out.println(num.pop());
    }
}

