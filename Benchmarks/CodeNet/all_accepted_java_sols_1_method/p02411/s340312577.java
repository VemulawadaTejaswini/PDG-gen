import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String[] lines = br.readLine().split(" ");
            int s1 = Integer.parseInt(lines[0]);
            int s2 = Integer.parseInt(lines[1]);
            int s3 = Integer.parseInt(lines[2]);
            if (s1 + s2 + s3 == -3) {
                break;
            }
            int sum = s1 + s2;
            String result = "";
            if (s1 == -1 || s2 == -1) {
                result="F";
            } else if (sum >= 80) {
                result = "A";
            } else if (sum >= 65) {
                result = "B";
            } else if (sum >= 50) {
                result = "C";
            } else if (sum >= 30) {
                result = "D";
                if (s3 >= 50) {
                    result = "C";
                }
            } else {
                result = "F";
            }
            System.out.println(result);
        }
    }
}