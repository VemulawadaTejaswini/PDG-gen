import java.math.*;
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        if(a==0){
            System.out.println(0);
        } else if(b==0){
            System.out.println(n);
        } else {
            long s = n/(a+b);
            if(n-s*(a+b)<=a){
                System.out.println(s*a+n-s*(a+b));
            } else {
                System.out.println(s*a+a);
            }
        }
	}
}