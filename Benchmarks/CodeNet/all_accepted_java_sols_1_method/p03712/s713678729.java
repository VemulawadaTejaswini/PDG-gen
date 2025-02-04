import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] number = line.split(" ");
        int n = Integer.parseInt(number[0]);
        int m = Integer.parseInt(number[1]);
        for(int i = 0; i < m + 2; i++) {
            System.out.printf("#");
        }
        System.out.println();
        for(int i = 0; i < n; i++) {
            line = br.readLine();
            System.out.println("#" + line + "#");
        }
        for(int i = 0; i < m + 2; i++) {
            System.out.print("#");
        }
        System.out.println();
    }
}