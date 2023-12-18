import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int h,n,sum;
        sum=0;
        h=scan.nextInt();
        n=scan.nextInt();
        if(h%n!=0){
            sum=1;
        }
        System.out.println(h/n+sum);
    }
}