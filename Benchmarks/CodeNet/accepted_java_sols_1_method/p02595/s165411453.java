import java.util.*;
import java.lang.Math;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long D = sc.nextLong();
        int counter = 0;
        for(int i = 0;i < N;i++){
            long X = sc.nextLong();
            long Y = sc.nextLong();
            if(D*D >= (X*X + Y*Y)){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
