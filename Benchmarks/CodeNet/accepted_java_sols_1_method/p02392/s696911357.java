import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();
        int b = num.nextInt();
        int c = num.nextInt();
        if (a < b && b < c) 
            System.out.println("Yes");
         else 
            System.out.println("No");
    }
}