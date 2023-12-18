import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int a1 = a/b;
        int a2 = a%b;
        double a3 = (double)a/b;

        System.out.println(a1 + " " + a2 + " " + a3);
    }
}
