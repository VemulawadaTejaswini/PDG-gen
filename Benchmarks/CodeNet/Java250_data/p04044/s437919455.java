import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.exec();
    }

    
    private void exec() {
        Scanner scanner = new Scanner(System.in);
        List<String> wordList = new ArrayList<>();
        int j = scanner.nextInt();
        int k = scanner.nextInt();
        
        for (int i = 0; i <= j; i++) {
            String input = scanner.nextLine();
            wordList.add(input);
        }
        Collections.sort(wordList);
        for (int i = 0; i <= j; i++) {
            System.out.print(wordList.get(i));
        }
    }
}        
        


