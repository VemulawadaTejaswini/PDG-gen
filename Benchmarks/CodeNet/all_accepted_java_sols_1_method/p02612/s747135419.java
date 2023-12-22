import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        Scanner scan = new Scanner(System.in);
        
        int x = scan.nextInt();
        
        int num = (x + 1000 - 1) / 1000;
        System.out.println(1000*num - x);
    }
}
