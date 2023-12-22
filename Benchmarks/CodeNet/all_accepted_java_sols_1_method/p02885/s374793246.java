import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = 0;
        if(a - 2 * b > 0){
            result = a - 2 * b;
        }
        System.out.println(result);
        sc.close();
    }
}