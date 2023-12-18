import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long res = LongStream.rangeClosed(1, N).filter(
                p->{
                    return !((p % 3 == 0) || (p%5 == 0));
                }
        ).sum();
        System.out.println(res);
    }

}
