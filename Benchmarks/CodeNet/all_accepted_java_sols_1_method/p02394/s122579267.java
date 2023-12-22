import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String param[] = input.split(" ");
        int W = Integer.parseInt(param[0]);
        int H = Integer.parseInt(param[1]);
        int x = Integer.parseInt(param[2]);
        int y = Integer.parseInt(param[3]);
        int r = Integer.parseInt(param[4]);
        if(r <= x && x <= W - r && r <= y && y <= H - r) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}