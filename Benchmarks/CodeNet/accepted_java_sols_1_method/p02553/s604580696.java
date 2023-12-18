import java.util.Scanner;

public class Main {
    static Scanner stdIn = new Scanner(System.in);
    public static void main(String[] args){
        long a = stdIn.nextLong();
        long b = stdIn.nextLong();
        long c = stdIn.nextLong();
        long d = stdIn.nextLong();

        long max = Long.MIN_VALUE;
        if(max < a * c)
            max = a * c;
        if(max < a * d)
            max = a * d;
        if(max < b * c)
            max = b * c;
        if(max < b * d)
            max = b * d;
        
        System.out.println(max);
    }
}