import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] str = line.split(" ");

        int num = Integer.parseInt(str[0]) + Integer.parseInt(str[1]);

        if(num >= 10){
            System.out.println("error");
        } else {
            System.out.println(num);
        }
    }

}
