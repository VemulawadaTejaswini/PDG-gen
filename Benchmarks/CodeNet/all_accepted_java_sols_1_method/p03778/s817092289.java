import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int change = 0;
        if(b < a){
            change = a;
            a = b;
            b = change;
        }
        if((a + w - b) > 0){
            System.out.println(0);
        }else{
            System.out.println(b - a - w );
        }
    }
}