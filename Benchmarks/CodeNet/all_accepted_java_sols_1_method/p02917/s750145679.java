import java.util.Scanner;
import java.io.*;

// public class Main {
//     public static void main(String[] args){
//         System.setOut(new PrintStream(new BufferedOutputStream(System.out)));
//         Scanner sc = new Scanner(System.in);
//     }
// }


public class Main {
    public static void main(String[] args){
        //System.setOut(new PrintStream(new BufferedOutputStream(System.out)));
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        int sum = 0;
        int a1;
        int a2;

        a1 = Integer.parseInt(sc.next());
        sum += a1;

        for(int i = 0; i < n - 2; i++){
            a2 = Integer.parseInt(sc.next());

            if(a1 < a2) sum += a1;
            else sum += a2;

            a1 = a2;
        }
        sum += a1;

        System.out.print(sum);

    }
}