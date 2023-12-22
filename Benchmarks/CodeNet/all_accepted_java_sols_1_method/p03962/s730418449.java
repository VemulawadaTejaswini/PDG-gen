
import java.util.*;

public class Main{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int num = 3;
        if(a == b && b == c){
            num = 1;
        }else if(a == b || b == c || c == a){
            num = 2;
        }
        System.out.println(num);
    }
}