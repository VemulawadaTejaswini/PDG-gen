import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arrays = {"P", "W", "G", "Y"};
        boolean[] arrayb = {false, false, false, false};
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < 4; j++) {
                if (s.equals(arrays[j])) {
                    arrayb[j] = true;
                }
            }
        }
        if (arrayb[0] && arrayb[1] && arrayb[2] && arrayb[3]) {
            System.out.println("Four");
        } else {
            System.out.println("Three");
        }
    }
}
