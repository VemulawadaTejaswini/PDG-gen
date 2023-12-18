import java.util.Scanner;
 
public class Main {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double ans = a * b;
        ans = Math.floor(ans);
        ans = ans * 1000 ;
        ans = ans /1000;
        long aw = (long)ans;
        System.out.println(aw);
        sc.close();
    }
}