import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] number = line.split(" ");
        int result = Integer.parseInt(number[0]) + Integer.parseInt(number[1]);
        if(result < 10) {
            System.out.println(result);
        } else {
            System.out.println("error");
        }
    }
}