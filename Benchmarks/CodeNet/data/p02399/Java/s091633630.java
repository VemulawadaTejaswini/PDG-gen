import java.util.Scanner;

public class Main {
   
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a,b,d,r;
        double f;
        a=scan.nextInt();
        b=scan.nextInt();
        
        d=a/b;
        r=a%b;
        f=(double)a/b;
        System.out.println(d +" "+ r +" "+ f);
    }
}