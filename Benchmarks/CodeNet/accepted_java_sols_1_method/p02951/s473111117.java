import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = a -b;
        if (result>=c){
            System.out.println(0);
        }else{
            System.out.println((c-result));
        }
        sc.close();
    }
}