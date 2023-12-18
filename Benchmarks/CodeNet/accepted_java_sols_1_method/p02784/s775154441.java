import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int n = sc.nextInt();
        int i = 0;
        do {
          h -= sc.nextInt();
          i++;
        } while (i<n && h>0);
        if (h>0){
          System.out.println("No");
        } else {
          System.out.println("Yes");
        }
        
    }
}
