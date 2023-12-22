import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int start = a > c ? a : c;
        int end = b < d ? b : d;

        int time = end - start > 0 ? end - start : 0;

        System.out.println(time);
    }
}