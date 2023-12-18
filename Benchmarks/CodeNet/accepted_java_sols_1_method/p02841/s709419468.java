import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int m1,d1,m2,d2;
        m1=scan.nextInt();
        d1=scan.nextInt();
        m2=scan.nextInt();
        d2=scan.nextInt();
        if(m1!=m2) System.out.println(1);
        else System.out.println(0);
    }
}