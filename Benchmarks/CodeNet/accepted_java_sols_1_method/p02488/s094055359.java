import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<String>();

        Scanner scan = new Scanner(System.in);
        scan.nextLine(); // to skip n
        while (scan.hasNext()) {
            words.add(scan.nextLine());
        }

        Collections.sort(words);

        String minimumWord = words.get(0);
        System.out.println(minimumWord);
    }
}