import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int zikan = m * 1900 + (n - m) * 100;
        int result = zikan * (int)Math.pow(2,m);
        System.out.println(result);
        sc.close();
    }
}