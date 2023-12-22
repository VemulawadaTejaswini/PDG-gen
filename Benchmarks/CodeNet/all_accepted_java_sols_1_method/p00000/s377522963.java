import java.util.stream.IntStream;
public class Main {
    public static void main(String[] args) {
        IntStream.of(1,2,3,4,5,6,7,8,9).forEach(n -> IntStream.of(1,2,3,4,5,6,7,8,9).forEach(m -> System.out.println(n + "x" + m + "=" + (n*m))));
    }
}