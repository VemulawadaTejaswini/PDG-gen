import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        long a = stdIn.nextLong();
        long b = stdIn.nextLong();
        long k = stdIn.nextLong();

        long x, y;
        if(k <= a){
            x = a - k;
            y = b;
        }else if(k <= a + b){
            x = 0;
            y = b - (k - a);
        }else{
            x = 0;
            y = 0;
        }

        System.out.println(x + " " + y);
    }
}