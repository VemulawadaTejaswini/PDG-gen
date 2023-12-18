import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    
        var sc = new Scanner(System.in);
    
        int n = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        int t = Integer.parseInt(sc.next());
        
        int a = 0;
        int b = 0;
        while(a < n){
            a += x;
            b += t;
        }
        System.out.println(b);
    }
}