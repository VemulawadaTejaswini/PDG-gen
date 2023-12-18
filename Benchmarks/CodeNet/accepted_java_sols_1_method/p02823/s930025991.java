import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        long n = Long.parseLong(sc.next());
        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        
        if((b-a) % 2 == 0){
            System.out.println((b-a) / 2);
        }else{
            System.out.println((Math.min(a-1, n-b)*2+1 + b-a) /2);
        }
    }
}