import java.util.*;
public class Main {
    private static long dp[][];
    private static int N;
    private static int A[];
    private static int B[];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        String res = "";
        if(3 == x.length()) {
            res += x.substring(2,3);
            res += x.substring(1,2);
            res += x.substring(0,1);
        } else {
            res = x;
        }
        System.out.println(String.format("%s", res));
    }
}