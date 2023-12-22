import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        Set<String> set = new HashSet<>();
        String value = input.readLine();
        char lastChar = value.charAt(value.length() - 1);
        set.add(value);
        for (int i = 1; i < n; i++) {
            value = input.readLine();
            if (set.contains(value) || lastChar != value.charAt(0)) {
                System.out.println("No");
                return;
            }
            set.add(value);
            lastChar = value.charAt(value.length() - 1);
        }
        System.out.println("Yes");
    }
}
