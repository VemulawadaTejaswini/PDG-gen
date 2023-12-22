import java.util.Scanner;

public class Main {
    static Scanner stdIn = new Scanner(System.in);
    public static void main(String[] args){
        long a = stdIn.nextLong();
        long b = stdIn.nextLong();
        long c = stdIn.nextLong();
        long k = stdIn.nextLong();

        if(k <= a){
            System.out.println(k);
        }else if(k <= a + b){
            System.out.println(a);
        }else{
            System.out.println(a - (k - a - b));
        }
    }
}