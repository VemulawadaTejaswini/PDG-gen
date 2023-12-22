import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        boolean judge = true;
        String[] target = s.split("");
        for (int i = 0; i < target.length && judge; i++) {
            if (i % 2 == 0) {
                judge = !"L".equals(target[i]);
            } else {
                judge = !"R".equals(target[i]);
            }
        }

        System.out.println(judge ? "Yes" : "No");
    }
}
