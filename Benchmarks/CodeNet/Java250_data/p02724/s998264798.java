import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tan = new Scanner(System.in);
        int x,a,b;
        x=tan.nextInt();
        a=x/500;
        b=(x%500)/5;
        System.out.println(a*1000+b*5);
    }
}
