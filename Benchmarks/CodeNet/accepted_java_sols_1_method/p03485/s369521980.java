import java.util.*;
 
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        double x = (a + b) / 2;
        System.out.println((int)Math.ceil(x));
    }
}