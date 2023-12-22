import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a=sc.nextLong();
        long b=sc.nextLong();
        long c=sc.nextLong();
        long left=4*a*b;
        long right= (c-a-b)*(c-a-b);
        if(c-a-b<=0){
            System.out.println("No");
            return;
        }
        if (left < right) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }
}