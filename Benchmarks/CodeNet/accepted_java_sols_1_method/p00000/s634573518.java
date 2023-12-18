import static java.util.stream.IntStream.range;

public class Main {

    public static void main(String[] args) {
        range(1, 10).forEach(i -> range(1, 10).forEach(j -> System.out.printf("%dx%d=%d\n", i, j, i * j)));
    }
}