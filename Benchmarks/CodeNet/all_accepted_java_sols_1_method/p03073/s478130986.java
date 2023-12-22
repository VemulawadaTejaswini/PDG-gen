import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        List<Integer> list = new ArrayList<>();

        if(str.length() == 1) {
            System.out.println(0);
        } else {
            for(int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                list.add(Character.getNumericValue(c));
            }
            int minCount = list.size();
            for(int i = 0; i < 2; i++) {
                int count = 0;
                for(int j = 0; j < list.size(); j++) {
                    if(j % 2 == 0 && list.get(j) != i) count++;
                    if(j % 2 == 1 && list.get(j) == i) count++;
                }
                if(minCount >= count) minCount = count;
            }

            System.out.println(minCount);
        }

    }
}