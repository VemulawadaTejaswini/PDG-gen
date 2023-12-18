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
        while(A.size()!=0) {
            int p = A.getFirst();
            A.removeFirst();

            boolean isPExistInRemains = false;
            for(Iterator<Integer> ite = A.iterator(); ite.hasNext(); ) {
                int next = ite.next();
                if(next % p == 0) ite.remove();
                if(next == p) isPExistInRemains = true;
            }
            if(!isPExistInRemains) numP++;
        }
        System.out.println(numP);
    }
}