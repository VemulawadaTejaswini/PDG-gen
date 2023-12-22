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
            int count = 0;
            for(int i = 0; i < list.size(); i++) {
                if(i == list.size() -1) break;
                int numA = list.get(i);
                int numB = list.get(i+1);
                if(numA == numB) {
                    count++;
                    if(numB == 0) {
                        list.set(i+1, 1);
                    } else {
                        list.set(i+1, 0);
                    }
                }
            }
            System.out.println(count);
        }

    }
}