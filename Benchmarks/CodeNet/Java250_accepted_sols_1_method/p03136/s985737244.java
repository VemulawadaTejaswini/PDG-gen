import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        ArrayList<Integer> sides = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            sides.add(sc.nextInt());
        }

        Collections.sort(sides, Collections.reverseOrder());

        int max = sides.get(0);
        int sumOfremains = 0;

        for (int i = 1; i < sides.size(); i++) {
            sumOfremains += sides.get(i);
        }

        System.out.println(max < sumOfremains ? "Yes" : "No");
    }
}


