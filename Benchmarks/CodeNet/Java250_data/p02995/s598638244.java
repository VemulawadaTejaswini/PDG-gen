import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        long d = scanner.nextLong();
        long count = b/c + b/d - b/(c * d / gcd(c,d)) - ((a-1)/c + (a-1)/d - (a-1)/(c * d / gcd(c,d)));
        //System.out.println(b/c + b/d - b/(c * d / gcd(c,d)));
        //System.out.println(((a-1)/c + (a-1)/d - (a-1)/(c * d / gcd(c,d))));
        System.out.println((b-a+1-count));
        
    }

    public static long gcd(long a, long b){
        if(b == 0){return a;}
        return gcd(b, a%b);
    }
}

