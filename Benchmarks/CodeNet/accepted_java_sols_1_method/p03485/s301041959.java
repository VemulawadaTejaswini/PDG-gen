import java.util.Scanner;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        double a2 = a;
        double b2 = b;
        
        double result = (a2 + b2)/2;
        
        int ans = (int) Math.ceil(result);
        System.out.println(ans);
    
    }
}