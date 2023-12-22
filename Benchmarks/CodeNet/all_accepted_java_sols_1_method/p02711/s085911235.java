import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();

        if(a.contains("7")){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}