import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int buf;
        while ((buf = System.in.read()) != '\n') {
            ;;
        }

        StringBuilder builder = new StringBuilder();
        int max = 0;
        int min = 1000;
        int num;
        while (true) {
            buf = System.in.read();
            if (buf != ' ' && buf != '\n') {
                builder.appendCodePoint(buf);
            } else {
                num = Integer.parseInt(builder.toString());
                if (num < min) min = num;
                if (max < num) max = num;
                if (buf == '\n') break;
                builder.setLength(0);
            }
        }

        System.out.print(max - min);
    }
}
