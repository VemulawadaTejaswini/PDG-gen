import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scn = new Scanner(System.in);
        long N = scn.nextLong();
        long A = scn.nextLong();
        long B = scn.nextLong();
        
        if(A!=0){
            long tmp = (N/(A+B))*A;
            tmp += N%(A+B)<=A ? N%(A+B) : A;
            System.out.println(tmp);
        }
        else System.out.println(0);
    }
}
