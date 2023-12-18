import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        int add = A + B;
        int sub = A - B;
        int mul = A * B;
        
        int ans = Math.max(add, sub);
        ans = Math.max(ans, mul);
        
        System.out.println(ans);
    }
}