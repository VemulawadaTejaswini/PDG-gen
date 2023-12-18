import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        long k = Long.parseLong(sc.next());
        
        if(a >= k){
            System.out.println(a-k + " " + b);
        }else{
            System.out.println(0 + " " + Math.max((b - (k-a)), 0));
        }
    }
}