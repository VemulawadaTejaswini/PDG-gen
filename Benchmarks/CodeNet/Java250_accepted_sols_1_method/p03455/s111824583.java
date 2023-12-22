import java.util.Scanner;
public class Main {
    private static Scanner scanner = new Scanner( System.in );
    public static void main(String args[]) {
       
        int a =  scanner.nextInt();
        int b =  scanner.nextInt();
        int  product = a*b;
        if(product % 2 == 0){System.out.print("Even");}
        else{System.out.print("Odd");}
    }
}
