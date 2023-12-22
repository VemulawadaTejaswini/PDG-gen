import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int r;
        while(a%b!=0){
            r=a%b;
            a=b;
            b=r;
        }
        System.out.println(b);
    }
}
