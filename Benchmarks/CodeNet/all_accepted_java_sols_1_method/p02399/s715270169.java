import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int d = 0;
        int r = 0;
        double f = 0.0;
        
        
        a = sc.nextInt();
        b = sc.nextInt();
        
        d = a/b;
        r = a%b;
        f = 1.0*a/b;
        
        System.out.println(d + " " + r + " " + String.format("%.5f",f));
        
    }
}

