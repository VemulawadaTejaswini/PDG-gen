import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var N = scanner.nextInt();
        var A = new LinkedList<Integer>();
        for(int i=0; i<N; i++)
            A.add(scanner.nextInt());

        A.sort(Comparator.naturalOrder());
        var numP = 0;
        var max = A.getLast();
        for(var p = A.getFirst(); p*p < max; p = A.getFirst()) {
            A.removeFirst();
            boolean isPExistInRemains = false;
            for(Iterator<Integer> ite = A.iterator(); ite.hasNext();) {
                var next = ite.next();
                if(next % p == 0) ite.remove();
                if(next.equals(p)) isPExistInRemains = true;
            }
            if(!isPExistInRemains) numP++;
            if(A.size() == 0) break;
        }
        numP += A.size();
        System.out.println(numP);
    }
}