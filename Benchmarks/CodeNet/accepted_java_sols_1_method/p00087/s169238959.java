import java.util.Scanner;
import java.util.Stack;

public class Main {
    static int h;
    static int w;
    static int c;
    static int ans;
    static int count;
    static int[] color_order;
    static int[][] map;
    static int[][] tmp;

    public static void main(String[] args) throws java.io.IOException {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String ns[] = sc.nextLine().split(" ");
            Stack<Double> stack = new Stack<Double>();
            for (int i = 0; i < ns.length; i++) {
                if (ns[i].length() > 1) {
                    stack.push(Double.parseDouble(ns[i]));
                } else {
                    char sw = ns[i].charAt(0);
                    switch (sw) {
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        stack.push(Double.parseDouble(ns[i]));
                        break;
                    case '+': {
                        double x = stack.pop();
                        double y = stack.pop();
                        stack.push(x + y);
                    }
                        break;
                    case '-': {
                        double x = stack.pop();
                        double y = stack.pop();
                        stack.push(y - x);
                    }
                        break;
                    case '*': {
                        double x = stack.pop();
                        double y = stack.pop();
                        stack.push(y * x);
                    }
                        break;
                    case '/':
                        double x = stack.pop();
                        double y = stack.pop();
                        stack.push(y / x);
                        break;
                    }
                }

            }
            double ans = stack.pop();
            System.out.printf("%.6f\n",ans);

        }
    }
}