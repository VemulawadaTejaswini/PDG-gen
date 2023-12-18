import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String word = sc.next();

        List<String> sentence = new ArrayList<String>();

        while (!sentence.contains("END_OF_TEXT")) {
            sentence.add(sc.next());
        }

        int count = 0;

        for (int i = 0; i < sentence.size(); i++) {
            if ((sentence.get(i)).equalsIgnoreCase(word)) {
                count++;
            }
        }

        System.out.println(count);

        sc.close();
    }
}
