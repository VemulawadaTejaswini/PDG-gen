import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("%d %d %f",a/b,a%b,(double)a/b);
        sc.close();
    }
}
