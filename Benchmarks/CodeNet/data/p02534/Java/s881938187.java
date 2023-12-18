import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        long A = Long.parseLong(line[0]);
        long B = Long.parseLong(line[1]);
        long C = Long.parseLong(line[2]);
        long D = Long.parseLong(line[3]);
        if((A<=D&&C<=B)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
