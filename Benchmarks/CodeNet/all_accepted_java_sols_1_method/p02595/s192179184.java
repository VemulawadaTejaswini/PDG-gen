
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        int n = Integer.parseInt(in[0]);
        double d = Double.parseDouble(in[1]);
        int c = 0;
        for(int i=0;i<n;i++){
            in = br.readLine().split(" ");
            double x = Double.parseDouble(in[0]);
            double y= Double.parseDouble(in[1]);
            if(Double.compare(d, Math.sqrt(Math.pow(x,2)+Math.pow(y,2)))>=0){
                c++;
            }
        }
            System.out.println(c);

    }
}
