import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long N = scanner.nextLong();

        ArrayList<Integer> cards = new ArrayList<>();

        for(int i=0; i<N; i++){
            cards.add(scanner.nextInt());
        }

        Collections.sort(cards, Collections.reverseOrder());

        int acc = 0;
        for(int i=0; i<N; i++){
            if(i%2 == 0){
                acc += cards.get(i);
            }else{
                acc -= cards.get(i);
            }
        }

        System.out.println(acc);

    }

    static List<Integer> primeList(int n) {
        List<Integer> list = new ArrayList<>();
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (!prime[i]) continue;
            for (int j = 2; i * j <= n; j++) {
                prime[i * j] = false;
            }
        }
        for (int i = 0; i < prime.length; i++) {
            if (prime[i]) list.add(i);
        }

        return list;
    }
}
