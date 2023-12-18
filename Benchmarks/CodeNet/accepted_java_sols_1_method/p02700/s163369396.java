import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        //r(a, 0, "");
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        int D = in.nextInt();
        boolean T = false;
        for(;;) {
            C -= B; //T
            if(C <= 0) {
                T = true;
                break;
            }
            A -= D; //A
            if(A <= 0) {
                T = false;
                break;
            }
        }
        if(T) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}
