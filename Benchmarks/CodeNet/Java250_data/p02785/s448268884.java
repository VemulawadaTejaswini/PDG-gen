import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int amountMonster;
        int PPspecatk;

        amountMonster = sc.nextInt();
        PPspecatk = sc.nextInt();

        List<Integer> HP = new ArrayList<>();
        for (int i = 0; i < amountMonster; i++) {
            HP.add(sc.nextInt());
        }
        Collections.sort(HP);

        long sum = 0;
        for (int i = 0; i < HP.size() - PPspecatk; i++) {
            sum += HP.get(i);
        }
        System.out.println(sum);
    }
}