import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var N = scanner.nextInt();
        var A = new TreeSet<Integer>();
        var duplicated = new TreeSet<Integer>();
        for(int i=0; i<N; i++) {
            var A_i =  scanner.nextInt();
            if(!A.add(A_i)) duplicated.add(A_i);
        }

        var A_MAX = A.last();
        var isPTable = new boolean[A_MAX+1];
        Arrays.fill(isPTable, true);

        for (Integer value : A) {
            if(!isPTable[value]) continue;
            if(duplicated.contains(value)) isPTable[value] = false;

            for(int i=2; ; i++) {
                var multiple = value*i;
                if(multiple > A_MAX) break;
                isPTable[multiple] = false;
            }
        }
        System.out.println(A.stream().filter(value -> isPTable[value]).count());
    }
}