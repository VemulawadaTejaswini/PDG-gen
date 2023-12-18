import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int m = a * b;
        int r = 2 * ( a + b );
        System.out.println( m + " " + r );
    }
}
