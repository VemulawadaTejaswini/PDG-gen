import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] number = line.split(" ");
        int n = Integer.parseInt(number[0]);
        int m = Integer.parseInt(number[1]);
        if(n + m < 10){
            System.out.println(n + m);
        } else {
            System.out.println("error");
        }
    }
}