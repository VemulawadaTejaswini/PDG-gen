import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
            new BufferedReader(new InputStreamReader(System.in));

        String[] line = reader.readLine().split(" ");
        int inputA = Integer.parseInt(line[0]);
        int inputB = Integer.parseInt(line[1]);

        if (inputA < inputB) {
            System.out.println("a < b");
        } else if (inputA > inputB) {
            System.out.println("a > b");
        } else {
            System.out.println("a == b");
        }
    }
}