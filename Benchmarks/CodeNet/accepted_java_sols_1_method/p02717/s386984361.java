import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int A = stdIn.nextInt();
        int B = stdIn.nextInt();
        int C = stdIn.nextInt();
        
        int t;

        t = A;
        A = B;
        B = t;

        t = A;
        A = C;
        C = t;

        System.out.print(A+" "+B+" "+C);
       


    }

}