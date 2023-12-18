import java.util.Scanner;
import java.util.Stack;

class Main {

    public static void main(String[] args) {
        Scanner sc = null;
        try {
            sc = new Scanner(System.in);
            while (sc.hasNextInt()) {
                int targetThing = sc.nextInt();
                int weight = 512;

                Stack<Integer> result = new Stack<Integer>();

                while (targetThing > 0) {
                    if (targetThing < weight) {
                        weight /= 2;
                    } else {
                        targetThing -= weight;
                        result.push(weight);
                    }
                }
                print(result);
            }
        } finally {
            sc.close();
        }
    }

    public static void print(Stack<Integer> list) {
        StringBuilder sb = new StringBuilder();
        for (int num : list) {
            sb.append(num).append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);

        System.out.println(sb);
    }
}