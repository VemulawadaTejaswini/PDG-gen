import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Main{
    public static void main(String[] a) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	String read = br.readLine();

	while (read.length() != 0) {
            String[] list = read.split(" ");

            int inputA = Integer.parseInt(list[0]);
            int inputB = Integer.parseInt(list[1]);

            System.out.println(String.valueOf(a + b).length());

            read = br.readLine();
        }
    }
}