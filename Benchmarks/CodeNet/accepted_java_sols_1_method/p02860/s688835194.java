import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = Integer.parseInt(sc.nextLine());
        String S = sc.nextLine();
        StringBuilder t = new StringBuilder();
        sc.close();

        if (!(r % 2 == 0)) {
            System.out.println("No");
        } else {
            for (int i = 0; i < r / 2; i++) {
                t.append(S.charAt(i));
                String sample = S.replaceFirst(t.toString(), "");
                sample = sample.replaceFirst(t.toString(), "");
                if (sample.equals("")) {
                    System.out.println("Yes");
                    return;
                }
            }
            System.out.println("No");
        }
    }

}