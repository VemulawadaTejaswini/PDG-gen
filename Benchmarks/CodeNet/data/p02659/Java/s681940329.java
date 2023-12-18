import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scan = new Scanner(System.in);
        double A=Double.parseDouble(scan.next());
        long AA=(long)Math.ceil(A);
         double B=Double.parseDouble(scan.next());
        long BB=(long)Math.ceil(B);
        long ans = AA*BB;
        long anss=(long)Math.ceil(A*B);
        if((AA*BB)>(long)Math.ceil(A*B) ) {
                System.out.println(AA*BB);
        }
        else{
            System.out.println((long)Math.ceil(A*B));
        }
    }
}
