import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        String[] x = sc.next().split("");
        String result = "";
        for (int i = 0; i < a; i++) {
            if (i == (b - 1)) {
                result += x[i].toLowerCase();
            } else {
                result += x[i];
            }
        }
        
        System.out.println(result);
    }
}
