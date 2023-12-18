import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var N = scanner.nextInt();
        if(N < 2) {
            if(N == 1)
                scanner.nextInt();
            System.out.println(N);
            return;
        }

        var A = new TreeSet<Integer>();
        var duplicated = new TreeSet<Integer>();
        for(int i=0; i<N; i++) {
            int a = scanner.nextInt();
            if(!A.add(a))
                duplicated.add(a);
        }
        var ps = new TreeSet<Integer>();
        while(!A.isEmpty()) {
            Integer p = A.pollFirst();

            int multiply = p;
            for(var iterator = A.iterator(); iterator.hasNext();) {
                var next = iterator.next();
                while(multiply < next) {
                    multiply += p;
                }
                if(multiply == next) iterator.remove();
            }
            if(!duplicated.contains(p))
                ps.add(p);
        }
        System.out.println(ps.size());
    }
}