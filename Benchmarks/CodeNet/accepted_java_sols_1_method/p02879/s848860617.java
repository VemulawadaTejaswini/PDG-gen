import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int a,b;
        a=scan.nextInt();
        b=scan.nextInt();
        if(a<=9&&b<=9){
            System.out.println(a*b);
        }
        else System.out.println(-1);
    }
}