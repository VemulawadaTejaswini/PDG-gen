import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.System.exit;

public class Main {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.lines().forEach(s -> {
            List<String> list = Arrays.stream(s.split(" "))
                    .collect(Collectors.toList());

            int a = Integer.parseInt(list.get(0));
            String op = list.get(1);
            int b = Integer.parseInt(list.get(2));

            switch (op) {
                case "+":
                    System.out.println(a + b);
                    break;
                case "-":
                    System.out.println(a - b);
                    break;
                case "*":
                    System.out.println(a * b);
                    break;
                case "/":
                    System.out.println(a / b);
                    break;
                case "?":
                    exit(0);
                default:
                    break;
            }
        });
    }
}