import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char s[] = scanner.nextLine().toCharArray();

        List<String> ans = new ArrayList<String>();
        for (char a:s) {
            if (a == '0') {
                ans.add("0");
            }else if (a == '1') {
                ans.add("1");
            }else if(a == 'B' && ans.size() != 0) {
                ans.remove(ans.size() - 1);
            }
        }
        for (String str:ans) {
            System.out.print(str);
        }
    }
}
