import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s;
        int sum;
        
        while (true) {
            s = sc.next();
            if (s.equals("0")) return;
            
            sum = 0;
            for (char c : s.toCharArray()) {
                sum += c - '0';
            }
            System.out.println(sum);
        }
    }
}