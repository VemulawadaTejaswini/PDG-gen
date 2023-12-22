import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.next().split("");
        List<String> sList = new ArrayList<>(Arrays.asList(s));
        int zeroCount = 0;
        int oneCount = 0;
        for (int i = 0; i < sList.size(); i++) {
            String target = sList.get(i);
            if ("0".equals(target)) {
                zeroCount++;
                continue;
            }
            oneCount++;
        }
        System.out.println(2 * Math.min(zeroCount, oneCount));
    }

}
