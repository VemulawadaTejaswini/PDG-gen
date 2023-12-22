import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // int N = Integer.parseInt(s.next());
        String S = s.next();
        List<String> ret = Arrays.asList(S.split("")).stream().distinct().collect(Collectors.toList());
        System.out.println(ret.size() == 1 ? "No" : "Yes");
    }
}