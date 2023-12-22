
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(Math.abs(a+b)%2==0 || a-b==0){
            System.out.println(Math.abs(a+b)/2);
            return;
        }
        System.out.println("IMPOSSIBLE");
    }
}