import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int h = scan.nextInt();
        int w = scan.nextInt();
        
        System.out.println((n-h+1)*(n-w+1));
    }
}
