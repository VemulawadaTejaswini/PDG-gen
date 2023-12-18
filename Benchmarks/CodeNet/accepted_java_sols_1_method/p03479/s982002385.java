
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = Long.parseLong(sc.next());
        long y = Long.parseLong(sc.next());
        long a = x;
        long res = 0;
        sc.close();
        while(a <= y){
            res++;
            a*=2;
        }
        System.out.println(res);
    }

}