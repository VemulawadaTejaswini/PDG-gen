import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        String num[] = N.split("");
        int ans = Integer.parseInt(num[N.length()-1]);
        if(ans == 0 || ans == 1 || ans== 6 || ans == 8)
        {
            System.out.println("pon");
        }
        else if(ans == 3)
        {
            System.out.println("bon");
        }
        else
        {
            System.out.println("hon");
        }
    }
}
