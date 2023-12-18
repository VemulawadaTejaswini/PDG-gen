import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        //入力準備
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.print(a/b);
        System.out.print(" ");
        System.out.print(a%b);
        System.out.print(" ");
        System.out.println(String.format("%.5f",(double)a/b));
        
    }
}

