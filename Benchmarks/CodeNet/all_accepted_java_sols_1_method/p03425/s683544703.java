import java.util.Scanner;
import java.util.Arrays;

public class Main {

public static void main(String [] args){

        long N;
        long M =0,A =0,R =0,C =0,H =0;
        long count =0;
        String name;
        Scanner input = new Scanner(System.in);

        N = input.nextLong();

        for (long i=0; i<N; i++ ) {
                name = input.next();
                if (name.startsWith("M",0) ==true) {
                        M++;
                }else if (name.startsWith("A",0) ==true) {
                        A++;
                }else if (name.startsWith("R",0) ==true) {
                        R++;
                }else if (name.startsWith("C",0) ==true) {
                        C++;
                }else if (name.startsWith("H",0) ==true) {
                        H++;
                }
        }

        count = M*A*R + M*A*C + M*A*H + M*R*C + M*R*H + M*C*H + A*R*C +A*R*H +A*C*H + R*C*H;

        System.out.println(count);
}
}
