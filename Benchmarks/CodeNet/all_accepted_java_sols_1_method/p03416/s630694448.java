import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        int count = 0;
        for (int i = Integer.parseInt(a); i <= Integer.parseInt(b); i++) {
            List<String> iList = Arrays.asList(String.valueOf(i).split(""));
            List<String> reverseList = new ArrayList<>();
            for (int j = iList.size() - 1; j >= 0; j--) {
                reverseList.add(String.valueOf(iList.get(j)));
            }
            for (int j = 0; j < iList.size(); j++) {
                if (!iList.get(j).equals(reverseList.get(j))) {
                    break;
                }
                if (j == iList.size() - 1) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

}
