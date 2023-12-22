import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        StringBuilder builder = new StringBuilder();
        int buf;
        while ((buf = System.in.read()) != '\n') {
            builder.appendCodePoint(buf);
        }

        int num = Integer.parseInt(builder.toString()) % 1000;
        if (num > 0) System.out.print(1000 - num);
        else System.out.print(0);
    }
}
