import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException{
        int n;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            n = Integer.parseInt(br.readLine());
        }
        String s = IntStream.rangeClosed(1, n)
                .filter(Main::checkAho)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" "));
        System.out.printf(" %s%n", s);
    }

    public static Boolean checkAho(int n) {
        return checkAho(n , true);
    }

    public static Boolean checkAho(int n, Boolean isFirst) {
        if(isFirst && n % 3 == 0) {
            return true;
        }else if(n % 10 == 3) {
            return true;
        }else if(n >= 10) {
            return checkAho(n / 10, false);
        }else {
            return false;
        }
    }
}
