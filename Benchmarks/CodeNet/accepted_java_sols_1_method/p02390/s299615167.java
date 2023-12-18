import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        int h=t/(60*60);
        int m=t%(60*60)/60;
        int s=t%60;
        System.out.println(h+":"+m+":"+s);
    }

}