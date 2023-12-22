import javax.print.DocFlavor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class  Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        String[] l = reader.readLine().split(" ");
        int s = 0;
        int sumsq = 0;
        for(String t:l){
            int y = Integer.parseInt(t);
            s=s+y;
            sumsq+=y*y;
        }
        int p =  (s/N);
        System.out.println(Math.min((N*p*p-2*p*s+sumsq),(N*(p+1)*(p+1) - 2*(p+1)*s+sumsq)));

    }
}
