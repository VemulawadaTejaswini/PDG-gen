import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long N = input.nextLong();
        List<Long> divisor = new ArrayList();

        for(long i = 1; i <= Math.sqrt(N); i ++){
            if (N % i == 0){
                if (i == Math.sqrt(N))
                    divisor.add(i);
                else {
                    divisor.add(i);
                    divisor.add(N/i);
                }
            }
        }
        divisor.sort(Comparator.naturalOrder());

        if (divisor.size()==2){
            System.out.println(N-1);
        }else if (divisor.size()%2 == 0){
            System.out.println(computeResult(N,divisor.get(divisor.size()/2)));
        }else {
            System.out.println((int)Math.sqrt(N)*2-2);
        }
    }

    static public long computeResult(long N, long input){
        long result;
        result = input + N/input - 2;

        return result;
    }
}