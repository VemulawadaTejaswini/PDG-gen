import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());
        int y = Integer.parseInt(sc.next());
        String postal = sc.next();
        String[] decomp = new String[3];
        decomp[0] = postal.substring(0, x);
        decomp[1] = postal.substring(x, x + 1);
        decomp[2] = postal.substring(x + 1, postal.length() - 1);
        for (int i = 0; i < 3; i++) {
            char[] array = decomp[i].toCharArray();
            if (i == 0 || i == 2) {
                for (char c : array) {
                    if (!Character.isDigit(c)) {
                        System.out.println("No");
                        return;
                    } 
                }
            } else {
                if (array[0] != '-') {
                    System.out.println("No");
                    return;
                }
            }
        }
        System.out.println("Yes");
    }
}
