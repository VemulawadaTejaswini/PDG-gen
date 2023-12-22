import java.util.*;

public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = sc.nextLong();
        sc.close();

        if(a == 0){
            System.out.println(b/x + 1);
        } else {
            if(a%x == 0)
                System.out.println(b/x - a/x + 1);
            else
                System.out.println(b/x - a/x);
        }
    }
}