import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        int all = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            String str = i + "";
            if (str.length() % 2 == 1) {
                all++;
            }
        }
        System.out.println(all + "");
    }
}