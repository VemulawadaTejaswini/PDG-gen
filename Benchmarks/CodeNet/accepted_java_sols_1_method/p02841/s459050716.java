import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m1= scan.nextInt();
        int d1= scan.nextInt();
        int m2= scan.nextInt();
        int d2= scan.nextInt();
        if(m1!=m2&&d2==1)System.out.println("1");
        else System.out.println("0");
        scan.close();
    }
}