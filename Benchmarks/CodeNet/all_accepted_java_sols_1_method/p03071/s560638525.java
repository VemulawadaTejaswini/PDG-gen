import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        //int n = stdIn.nextInt();
        //int p = stdIn.nextInt();
        
        System.out.println(Math.max(a + a - 1, Math.max(b + b - 1, a + b)));
        
        //System.out.println();
        //System.out.print();
    }
}
