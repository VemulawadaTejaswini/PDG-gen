import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int n = sc.nextInt();
        if(n == 100){
            System.out.println((int)Math.pow(100,d) * (n+1));
        }else{
            System.out.println((int)Math.pow(100,d) * n);
        }
        
    }
}
