import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        ArrayList<Long> list = new ArrayList<Long>();
        for (var i = 0; i < n; i++) {
            long a = sc.nextLong();
            list.add(a);
        }
        list.sort(Collections.reverseOrder());
        double ansMax = list.get(0);
        double ansMin = 0;
        double ansMid = (ansMax + ansMin) / 2;

        Solver s = new Solver();
        while (true){
            if (s.solve(list, k, ansMid)){
                ansMax = ansMid;
            } else{
                ansMin = ansMid;
            }
            ansMid = (ansMax + ansMin) / 2;
            if ((long) ansMax - (long) ansMin <= 1){
                System.out.println((long) Math.ceil(ansMin));
                break;
            }
        }
    }
}

class Solver {
    boolean solve(List<Long> list, long k, double length){
        long count = 0;
        if (length < 1.){
            for (var a : list) {
                count += a + 1;
                if (count > k) return false;
            }
            return true;
        }
        for (var a : list){
            count += Math.max((long) Math.ceil(a / length) - 1, 0);
            if (count > k) return false;
        }
        return true;
    }
}
