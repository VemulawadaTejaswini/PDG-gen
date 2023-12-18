import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int a,b;
         a=scan.nextInt();b=scan.nextInt();
        double c = (double) a/b;
        System.out.printf("%d %d %f\n",a/b,a%b,c); 
    }
}
