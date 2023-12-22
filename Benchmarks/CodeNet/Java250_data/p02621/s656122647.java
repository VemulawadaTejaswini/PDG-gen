import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int ans = a + a*a + a*a*a;
        lp(ans);
    }
    public static void lp(Object o){
        System.out.println(o);
    }
}
