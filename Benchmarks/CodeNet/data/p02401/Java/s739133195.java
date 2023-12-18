import java.io.*;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class Main {
        public static void main(String[] args) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                ArrayList<String> res = new ArrayList<>();
                try {
                        outside: while (true) {
                                String line = reader.readLine();
                                StringTokenizer tokenizer = new StringTokenizer(line);
                                int a = Integer.parseInt(tokenizer.nextToken());
                                String op = tokenizer.nextToken();
                                int b = Integer.parseInt(tokenizer.nextToken());
                                switch (op) {
                                case "?":
                                        break outside;
                                case "+":
                                        res.add(String.valueOf(a + b));
                                        break;
                                case "-":
                                        res.add(String.valueOf(a - b));
                                        break;
                                case "*":
                                        res.add(String.valueOf(a * b));
                                        break;
                                case "/":
                                        res.add(String.valueOf(a / b));
                                        break;
                                default:
                                        return;
                                }
                        }
                } catch (Exception e) {
                        e.printStackTrace();
                }
                System.out.println(String.join("\n", res));
        }
}

