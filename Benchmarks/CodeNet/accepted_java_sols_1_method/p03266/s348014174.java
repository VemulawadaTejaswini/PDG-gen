import java.util.*;
 
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long a = n/k;
 
        if (k%2==1){
            System.out.println(a*a*a);
        }else {
            long b = (n+k/2)/k;
            System.out.println(a*a*a+b*b*b);
        }
    }
}