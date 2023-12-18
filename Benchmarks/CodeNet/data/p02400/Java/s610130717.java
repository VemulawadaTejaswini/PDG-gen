import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] lines=br.readLine().split(" ");
        int r=Integer.parseInt(lines[0]);
        System.out.printf("%f %f",Math.PI*r*r,2*Math.PI*r);
    }
}