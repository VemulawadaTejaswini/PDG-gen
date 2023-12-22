import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws java.lang.Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();

        double[] array = Arrays.stream(br.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

        double gyakusum = Arrays.stream(array).map(i -> 1 / i).sum();

        System.out.println(1 / gyakusum);

    }
}