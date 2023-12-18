import java.util.*;
 
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int n = Integer.parseInt(line);
 
        long count = 0;
        for (int c = 1; c < n; c++) {
            int ab = (n - c);
            for (int i = 1; i < ab; i++) {
                if ((ab / i) * i == ab) {
                    count++;
                }
            }
        }
 
        System.out.println(count);
    }
 
}