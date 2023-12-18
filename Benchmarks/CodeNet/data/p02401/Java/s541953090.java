import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> A = new ArrayList<Integer>();
        int counter = 0;

        while (counter == 0) {
            int a = sc.nextInt();
            String op = sc.next();
            int b = sc.nextInt();

            switch (op) {
                case "+" : A.add(a + b); break;
                case "-" : A.add(a - b); break;
                case "*" : A.add(a * b); break;
                case "/" : A.add(a / b); break;
                default: {
                    for (int i=0; i<A.size(); i++) {
                        System.out.println(A.get(i));
                    }
                    counter = 1;
                    break;
                }
            }
        }

    }
}
