import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
    execute();
    }

    private static void execute() throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        System.out.println(eat(line));
    }

    public static int eat(String symbols) {
        int number = 0;
        for (char ch : symbols.toCharArray()) {
            switch (ch) {
                case '+':
                    number++;
                    break;
                case '-':
                    number--;
                    break;
            }
        }
        return number;
    }
}