import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        
        int res = x - a;
        int cnt = (int) Math.floor(res / b);
        res -= (cnt*b);

        System.out.println(res);

        scan.close();
    
    }

}