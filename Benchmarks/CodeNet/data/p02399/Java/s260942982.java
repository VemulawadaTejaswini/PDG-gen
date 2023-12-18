import java.util.Scanner;
import java.util.Formatter;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        System.out.println(a/b+" "+a%b+" "+String.format("%.5f", 1.0*a/b));
    }
}
