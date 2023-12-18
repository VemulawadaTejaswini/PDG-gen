import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       Scanner num = new Scanner(System.in);
       int a = num.nextInt();
       int b = num.nextInt();
        System.out.print(a*b+" "+(a+b)*2);
        System.out.println("");
    }
}