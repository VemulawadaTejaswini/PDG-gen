import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long n = sc.nextLong();
        if(n >= (a + b)){
            a = b = 0;
        }else{
            if(n <= a){
                a -= n;
            }else{
                n -= a;
                b -= n;
                a = 0;
            }
        }
        System.out.println(a + " " + b);
    }
}
