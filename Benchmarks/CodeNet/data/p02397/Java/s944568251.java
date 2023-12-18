import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        while (true) {
            String[] lines = br.readLine().split(" ");
            int a = Integer.parseInt(lines[0]);
            int b = Integer.parseInt(lines[1]);
            if(a==0 && b==0){
                break;
            }
            if (a > b) {
                System.out.println(b + " " + a);
            } else {
                System.out.println(a + " " + b);
            }
        }
    }
}