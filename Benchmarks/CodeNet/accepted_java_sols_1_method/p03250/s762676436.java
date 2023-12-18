import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a >= b){
            if(a >= c){
                System.out.println(10 * a + b + c);
            }else {
                System.out.println(10 * c + a + b);
            }
        }else{
            if(b > c) {
                System.out.println(10 * b + a + c);
            }else{
                System.out.println(10 * c + a + b);
            }
        }
    }
}
