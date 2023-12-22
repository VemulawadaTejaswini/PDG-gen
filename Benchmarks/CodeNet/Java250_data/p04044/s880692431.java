import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int volume = scanner.nextInt();
        int length = scanner.nextInt();
        // 文字の取得
        List<String> list = new ArrayList<>();
        for (int n = 0; n < volume; n ++) {
            String word = scanner.next();
            list.add(word);
        }
        List<String> sortedList = list.stream().sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        String result = "";
        for (String word : sortedList) {
            result += word;
        }
        System.out.println(result);
    }
}