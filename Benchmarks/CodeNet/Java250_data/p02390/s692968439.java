import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int x,h,m,s;
        Scanner sc = new Scanner(System.in);
        x=sc.nextInt();
        h=x/3600;
        m=(x-3600*h)/60;
        s=x-3600*h-60*m;
        System.out.printf("%d:%d:%d%n",h,m,s);
    }
}