import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int w = sc.nextInt();
        
        System.out.println((s <= w)? "unsafe" : "safe");
    }
}