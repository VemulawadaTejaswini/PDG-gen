import java.util.Scanner;

public class Main {
   
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a,b;
        a=scan.nextInt();
        b=scan.nextInt();
        System.out.print("a");
        if(a>b)System.out.print(" > ");
        else if(a<b)System.out.print(" < ");
        else if(a==b)System.out.print(" == ");
        System.out.println("b");
        }
}