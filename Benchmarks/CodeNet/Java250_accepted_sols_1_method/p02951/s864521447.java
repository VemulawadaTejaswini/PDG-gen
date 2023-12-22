import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int empty = a - b;
        
        if (c - empty < 0) {
            System.out.println(0);
        } else {
            System.out.println(c - empty);   
        }
    }
}
