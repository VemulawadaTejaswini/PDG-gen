import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int m = A + B;
        if(m < (A - B)){
            m = A - B;
        }
        if(m < (A * B)){
            m = A * B;
        }
        System.out.println(m);
    }
}
