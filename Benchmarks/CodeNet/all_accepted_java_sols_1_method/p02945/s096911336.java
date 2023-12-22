import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int a,b;
        a=scan.nextInt();
        b=scan.nextInt();
        System.out.println(Math.max(Math.max(a+b, a-b),a*b));
    }
}