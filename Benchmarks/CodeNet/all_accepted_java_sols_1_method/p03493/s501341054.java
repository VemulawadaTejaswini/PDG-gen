import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final long count = Arrays.stream(br.readLine().split("")).filter(i -> i.equals("1")).count();
        System.out.println(count);

    }
}