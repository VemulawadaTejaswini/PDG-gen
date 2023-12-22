import java.lang.reflect.Array;
import java.util.*;
public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if ((n / 100) * 111 >= n){
            System.out.println((n / 100 ) * 111);
        }else{
            System.out.println((n / 100 + 1) * 111);
        }

    }
}