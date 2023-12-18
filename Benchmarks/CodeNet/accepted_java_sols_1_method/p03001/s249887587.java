import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long w = sc.nextInt();
        long h = sc.nextInt();
        long x = sc.nextInt();
        long y = sc.nextInt();
        System.out.print(((w*h)/2d)+" ");
        if (w==2*x&&h==2*y)System.out.println(1);
        else System.out.println(0);
    }
}
