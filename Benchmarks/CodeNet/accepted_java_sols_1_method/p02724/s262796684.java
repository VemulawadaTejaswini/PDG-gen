import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long x=sc.nextInt();
        long a=x/500;
        System.out.println(1000*a+5*((x-500*a)/5));
    }
    
}
