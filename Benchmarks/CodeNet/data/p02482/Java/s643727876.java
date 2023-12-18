import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        int m = s.nextInt();
        int n = s.nextInt();
        String t;
        
        if( m > n ){
            t = "a > b";
        }else if( m == n ){
            t = "a == b";
        }else{
            t = "a < b";
        }
        System.out.println(t);
    }
}