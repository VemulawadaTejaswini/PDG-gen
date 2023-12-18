import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public Main() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int R = 0;
        TreeSet<Integer> TS = new TreeSet<>();
        HashSet<Integer> THK = new HashSet<>();
        for (int i = 0; i < N; i++){
            int IN = scanner.nextInt();

            if( TS.contains(IN) ){
                THK.add(IN);
            } else {
                TS.add(IN);
            }
        }

        while(!TS.isEmpty()){
            int MIN = TS.higher(0);

            int L = MIN*2-1;
            while (TS.higher(L) != null){
                int VAL = TS.higher(L);

                if(VAL % MIN == 0){
                    TS.remove(VAL);
                } else {
                    L = VAL;
                }
            }

            TS.remove(MIN);
            R++;
        }

        System.out.println(R - THK.size());
    }

    boolean isPrime(int N){
        if(N == 2) return true;

        for (int i = 3; i*i <= N; i+=2) {
            if(N % i == 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        new Main();
    }
}
