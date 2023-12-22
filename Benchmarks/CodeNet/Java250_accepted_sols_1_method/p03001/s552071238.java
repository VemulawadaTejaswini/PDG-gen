import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long w=sc.nextInt();
        long h=sc.nextInt();
        long x=sc.nextInt();
        long y=sc.nextInt();
        System.out.print(((double)(w*h)/2.0)+" ");
        System.out.println(x*2==w&&y*2==h?1:0);

    }


}