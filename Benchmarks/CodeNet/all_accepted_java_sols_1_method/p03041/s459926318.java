import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String str = sc.next();
        
        str = str.substring(0,k-1).toUpperCase() + str.substring(k-1,k).toLowerCase() + str.substring(k,n).toUpperCase();
        
        System.out.println(str);
    }
}
