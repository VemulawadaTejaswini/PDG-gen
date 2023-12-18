import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        sc.nextLine();

        String[] words = new String[N];
        for (int i = 0; i < N; i++) {
            words[i] = sc.nextLine();
        }

        ArrayList<String> store = new ArrayList<>();

        char lastChar = words[0].charAt(words[0].length() - 1);

        for (int i = 0; i < N; i++) {
            if (i == 0) {
                store.add(words[i]);
                continue;
            }

            if (lastChar != words[i].charAt(0)) {
                System.out.println("No");
                return;
            }

            for (String word : store) {
                if (word.equals(words[i])) {
                    System.out.println("No");
                    return;
                }
            }

            lastChar = words[i].charAt(words[i].length() - 1);
            store.add(words[i]);
        }

        System.out.println("Yes");

    }
}