import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int a = Integer.parseInt(line[0]),
            b = Integer.parseInt(line[1]),
            c = Integer.parseInt(line[2]);
        
        int colors = 1;
        if(b!=a) colors++;
        if(c!=a && c!=b) colors++;
        System.out.println(colors);
    }
}
