import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        String result = "B";
        if (Math.abs(x-a) < Math.abs(x-b)) result = "A";

        System.out.println(result);
    }
}
