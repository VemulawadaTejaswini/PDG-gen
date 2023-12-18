import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        final String X = "X";
        final String EQUAL = "=";
        final String RETURN_MARK = "\n";
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                sb.append(i).append(X).append(j).append(EQUAL).append(i * j)
                        .append(RETURN_MARK);
            }
        }

        System.out.print(sb);
    }
}