
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String line=br.readLine();
        String split[]=line.split(" ",0);
        int a=Integer.parseInt(split[0]);
        int b=Integer.parseInt(split[1]);
        int c=Integer.parseInt(split[2]);
        if (a<b&&b<c) {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}