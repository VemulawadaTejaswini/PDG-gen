import java.util.*;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long l = sc.nextLong();
        double d = sc.nextDouble();
        System.out.println((long)Math.floor(l * d));
    }
}