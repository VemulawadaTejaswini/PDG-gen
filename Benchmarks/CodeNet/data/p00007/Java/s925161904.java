import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.parseInt(s);
        double tot = 100000;
        for (int i=1; i < n+1; i++){
            tot = tot * 1.05;
            if (tot%1000 != 0){
                tot = tot - tot%1000 + 1000;
            }
        }
        System.out.println((int)tot);
    }
}