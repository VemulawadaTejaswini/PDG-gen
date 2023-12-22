import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        if (x>=2000){
            System.out.println(1);
            return;
        }
        if (x<100){
            System.out.println(0);
            return;
        }

        int n = String.valueOf(x).length();

        if (n==3){
            int tmp = (int)Math.pow(10, n-1);

            int top = x / tmp;

            int bottom = x % tmp;

            if ((0 <= bottom) && (bottom <= (top * 5))){
                System.out.println(1);
                return;
            }else {
                System.out.println(0);
                return;
            }
        }

        if (n==4){
            int tmp = (int)Math.pow(10, n-2);
            int top = x / tmp;

            int bottom = x % tmp;

            if ((0 <= bottom) && (bottom <= (top * 5))){
                System.out.println(1);
                return;
            }else {
                System.out.println(0);
                return;
            }
        }

    }
}