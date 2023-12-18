import java.util.*;

public class Main{

    public static List<Integer> P;
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int even = N/2;
        int odd = N - even;

        System.out.println((double)odd / (double)N);

    }
}
