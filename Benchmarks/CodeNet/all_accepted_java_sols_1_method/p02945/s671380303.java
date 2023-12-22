import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
         int add = n1+n2;
         int mul = n1*n2;
         int sub = n1-n2;
        // System.out.println(add);
        // System.out.println(mul);
        // System.out.println(sub);
         if(add>mul &&add>sub)System.out.println(add);
         else if(mul>sub)
            System.out.println(mul);
         else System.out.println(sub);
         
    }
}
