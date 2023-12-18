import java.util.*;
public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> ans = new ArrayList<Integer>();
    Scanner sc = new Scanner(System.in);
        while(true) {
            String line = sc.nextLine();
            String[] linesp = line.split(" ");
            int a = Integer.parseInt(linesp[0]);
            String op = linesp[1];
            int b = Integer.parseInt(linesp[2]);
            if (op.equals("+")) {
                ans.add(a + b);
            } else if (op.equals("-")) {
                ans.add(a - b);
            } else if (op.equals("*")) {
                ans.add(a * b);
            } else if (op.equals("/")) {
                ans.add(a / b);
            } else if (op.equals("?")) {
                break;
            }
        }
        for(int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
  }
}

