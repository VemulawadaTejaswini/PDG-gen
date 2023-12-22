import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        String[] b = sc.next().split("");
        int cntR = 0;
        int cntB = 0;
        for (int i = 0; i < a; i++) {
            if (b[i].equals("R")) {
                cntR++;
            } else {
                cntB++;
            }
        }
        if (cntR > cntB) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
