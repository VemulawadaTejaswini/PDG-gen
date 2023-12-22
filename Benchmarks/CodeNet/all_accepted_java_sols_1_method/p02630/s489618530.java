import java.util.*;

public class Main{
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    long N = scan.nextInt();
    long A;
    long sum = 0;
    Map<Long,Long> map = new HashMap<>();
    for(long i=0;i<N;i++) {
        A = scan.nextInt();
        if (map.containsKey(A)) {
            map.put(A,map.get(A)+1);
        } else {
            map.put(A,(long)1);
        }
        sum += A;
    }

    long Q = scan.nextInt();
    long B;
    long C;
    StringBuilder sb = new StringBuilder();
    for(long i=0;i<Q;i++) {
        B = scan.nextInt();
        C = scan.nextInt();
        if (!map.containsKey(B)) {
            sb.append(String.valueOf(sum) + "\n");
            continue;
        }

        long diff = map.get(B);
        map.remove(B);
        sum += ((C - B) * diff);
//System.out.println("sum:" + sum + " C-B:" + String.valueOf(C-B) + " diff:" + String.valueOf(diff));

        if (map.containsKey(C)) {
            map.put(C, map.get(C) + diff);
        } else {
            map.put(C,diff);
        }
        sb.append(String.valueOf(sum) + "\n");
    }
    scan.close();

    System.out.print(sb);
}
}
