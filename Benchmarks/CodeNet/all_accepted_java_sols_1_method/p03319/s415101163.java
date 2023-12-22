import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println( (n-1) % (k-1) == 0 ? (n-1)/(k-1) : (n-1)/(k-1)+1);
    }
}
