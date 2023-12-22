import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = Math.max(Math.max(a, b), c);
        
        int dif = max * 3 - a - b - c;
        if (dif % 2 == 0) {
            System.out.println(dif / 2);
        } else {
            System.out.println(dif / 2 + 2);
        }
    }
}
