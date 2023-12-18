import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int i = 1;
        int j = 2;
        while (true) {
            if (n <= i) break;
            
            i += j;
            j++;
        }
        
        System.out.println(j - 1);
    }
}
