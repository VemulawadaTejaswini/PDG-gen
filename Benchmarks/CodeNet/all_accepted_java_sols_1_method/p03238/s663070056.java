import java.util.*;
public class Main {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N = Integer.parseInt(scan.next());

        if(N == 1)System.out.println("Hello World");
        if(N == 2){
            int A = Integer.parseInt(scan.next());
            int B = Integer.parseInt(scan.next());
            System.out.println(A + B);
        }
    }
}
