import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by bi16060 on 2019/03/24.
 */
public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String enki = br.readLine();

        String pair = "";
        switch(enki){
            case("A"):
                pair = "T"; break;
            case("T"):
                pair = "A"; break;
            case("G"):
                pair = "C"; break;
            case("C"):
                pair = "G"; break;
        }

        System.out.println(pair);
    }
}
