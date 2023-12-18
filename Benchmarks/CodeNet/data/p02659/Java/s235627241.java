import java.util.Scanner;
    
class Main {    
    public static void main(String[] args) { 
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        double b = in.nextDouble();
        long ans = (long)Math.floor(a*b);
        
        System.out.println(ans);
    }
}