import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        boolean all  = ((a == b) && (b == c));
        boolean all_not = ((a != b) && (a != c) && (b != c));
        
        if(all || all_not) System.out.println("No");
        else System.out.println("Yes");
    }
}