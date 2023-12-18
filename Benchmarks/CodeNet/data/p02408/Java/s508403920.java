import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    private static Map<String, List<Integer>> cardsPerMark = new HashMap<>();
    static {
        cardsPerMark.put("S", createCardsList());
        cardsPerMark.put("H", createCardsList());
        cardsPerMark.put("C", createCardsList());
        cardsPerMark.put("D", createCardsList());
    }

    public static void main(String[] args) {
        Map<String, List<Integer>> inputCardsPerMark = new HashMap<>();
        inputCardsPerMark.put("S", new ArrayList<>());
        inputCardsPerMark.put("H", new ArrayList<>());
        inputCardsPerMark.put("C", new ArrayList<>());
        inputCardsPerMark.put("D", new ArrayList<>());

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String mark = sc.next();
            int number = sc.nextInt();

            List<Integer> numbers = inputCardsPerMark.get(mark);
            numbers.add(number);
            inputCardsPerMark.put(mark, numbers);
        }

        for (String mark : Stream.of("S", "H", "C", "D").collect(Collectors.toList())) {
            List<Integer> numbers = cardsPerMark.get(mark);
            List<Integer> inputNumbers = inputCardsPerMark.get(mark);
            numbers.removeAll(inputNumbers);
            for (Integer number : numbers) {
                System.out.printf("%s %d\n", mark, number);
            }
        }
        sc.close();
    }

    private static List<Integer> createCardsList() {
        List<Integer> cardsList = new ArrayList<>();
        for (int i = 1; i <= 13; i++) {
            cardsList.add(i);
        }
        return cardsList;
    }
}
