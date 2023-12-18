import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] lines=br.readLine().split(" ");
        int a=Integer.parseInt(lines[0]);
        int b=Integer.parseInt(lines[1]);
        System.out.println(a/b+" "+a%b+" "+(double)a/(double)b);
    }
}