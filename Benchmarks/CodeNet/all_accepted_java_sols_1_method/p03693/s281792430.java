import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] str = line.split(" ");

        int num = Integer.parseInt(str[0])*100 + Integer.parseInt(str[1])*10 + Integer.parseInt(str[2]);

        if(num % 4 == 0){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}