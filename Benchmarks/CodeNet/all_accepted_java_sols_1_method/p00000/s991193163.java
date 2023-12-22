import java.util.Arrays;
public class Main {
    static int[] baseNumbers = {1,2,3,4,5,6,7,8,9};
    public static void main(String[] args) {
        Arrays.stream(baseNumbers).forEach(n -> Arrays.stream(baseNumbers).forEach(m -> System.out.println(n + "x" + m + "=" + (n*m))));
    }
}