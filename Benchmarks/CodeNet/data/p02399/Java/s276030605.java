import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] lines=br.readLine().split(" ");
        double a=Double.parseDouble(lines[0]);
        double b=Double.parseDouble(lines[1]);
        System.out.println((int)a/(int)b+" "+(int)a%(int)b+" "+a/b);
    }
}