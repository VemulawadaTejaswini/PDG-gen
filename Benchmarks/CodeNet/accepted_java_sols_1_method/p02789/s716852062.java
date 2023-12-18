import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));
        String[] l = reader.readLine().split(" ");
        int N = Integer.parseInt(l[0]);
        int M = Integer.parseInt(l[1]);
        if(N==M) System.out.println("Yes");
        else System.out.println("No");
    }
}
