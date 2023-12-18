import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        long n = Long.parseLong(sc.next());
        
        if(n >= b-1){
            System.out.println((a*(b-1))/b - a*((b-1)/b));
        }else{
            System.out.println((a*n)/b - a*(n/b));
        }
    }
}