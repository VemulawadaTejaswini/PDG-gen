import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int a = n % 10;
        int b = n / 10 % 10;
        int c = n / 100 % 10;
        if(n <= c*100+c*10+c) System.out.println( c*100+c*10+c);
        else System.out.println((c+1)*100+(c+1)*10+(c+1));
        
    }
    public static int min(int a, int b) {
        if(a <= b) return a;
        else return b;
    }
    public static int max(int a, int b) {
        if(a <= b) return b;
        else return a;
    }
}