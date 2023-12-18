import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        try{
            InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(in);
            String num = br.readLine();
            int number = Integer.parseInt(num);
            int m = number*number*number;
            in.close();
            System.out.println(m);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}