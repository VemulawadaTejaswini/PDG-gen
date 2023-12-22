import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        long sum2 = 0;
        for (int i = 1; i <= n; i++) {
            String str = String.valueOf(i);
            int sum = 0;
            for (int j = 0; j < str.length(); j++) {
                sum += Integer.parseInt(String.valueOf(str.charAt(j)));
            }
            
            if (a <= sum && sum <= b) {
                sum2 = sum2 + i;
            }
        }
        System.out.println(sum2);
    }
}
