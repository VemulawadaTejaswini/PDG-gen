import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> dictionary = new HashSet<>();

        Scanner inp = new Scanner(System.in);
        int total = inp.nextInt();

        for (int k = 0; k < total; k++) {
            String command = inp.next();
            String letter = inp.next();

            switch (command) {
                case "insert":
                    dictionary.add(letter);
                    break;
                case "find":
                    if (dictionary.contains(letter)) {
                        System.out.println("yes");
                    } else {
                        System.out.println("no");
                    }

                    break;
                default:
                    break;
            }
        }
    }
}

