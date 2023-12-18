import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int P = scanner.nextInt();
        int Q = scanner.nextInt();
        int R = scanner.nextInt();

        List<Integer> time = new ArrayList<>();
        time.add(P+Q);
        time.add(Q+R);
        time.add(R+P);

        System.out.println(Collections.min(time));

    }
}