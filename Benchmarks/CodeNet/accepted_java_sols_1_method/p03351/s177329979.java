import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        String result = "No";
        if ( (Math.abs(a-c) <= d) || (Math.abs(a-b) <= d && Math.abs(b-c) <= d) ) result = "Yes";
        System.out.println(result);
    }
}
