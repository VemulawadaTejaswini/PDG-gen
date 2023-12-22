import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while (!(line = br.readLine()).equals("0")) {
            String[] lines = br.readLine().split(" ");
            double[] list = new double[lines.length];
            int n = lines.length;
            double total = 0.0; //????¨????
            double average = 0.0; //?????????
            double var = 0.0; //?????£
            while (n-- > 0) {
                list[n] = Double.parseDouble(lines[n]);
                total+=list[n];
            }
            n=lines.length;
            average=total/n;
            for(int i=0;i<n;i++){
                var+=((list[i]-average)*(list[i]-average));
            }
            System.out.printf("%f\n",Math.sqrt(var/n));
        }
    }
}