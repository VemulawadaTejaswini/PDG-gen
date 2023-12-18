import java.util.*;
import java.math.*;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        double b = sc.nextDouble();
        if(a==1){
            System.out.println(0);
        } else if(a==0||b==0) {
            System.out.println(0);

        } else {
            long c = (long) Math.floor(a*b);
            System.out.println(c);
        }
    }
}