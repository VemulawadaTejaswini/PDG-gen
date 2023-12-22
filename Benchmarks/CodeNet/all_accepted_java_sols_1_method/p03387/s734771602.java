import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int max = Math.max(Math.max(a, b), c);
        int sum = a + b + c;
        
        int goal = max * 3;
        if ((goal - sum) % 2 == 1) {
            goal += 3;
        }
        
        System.out.println((goal - sum) / 2);
    }
}
