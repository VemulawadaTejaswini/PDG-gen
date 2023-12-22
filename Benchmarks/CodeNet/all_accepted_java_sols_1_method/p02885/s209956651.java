import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int b = sc.nextInt();
        
        if(b*2 >= n){
            System.out.println(0);
        } else {
            System.out.println(n - 2*b);
        }
    }
}