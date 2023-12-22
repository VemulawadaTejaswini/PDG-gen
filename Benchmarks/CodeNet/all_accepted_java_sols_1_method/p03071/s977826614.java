import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = Math.max(a, b);
        int d = Math.min(a, b);
        int out = 0;
        out += c;
        out += Math.max(c - 1, d);
        System.out.println(out);
        scan.close();
    }
}