
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        String T = br.readLine();
        String actualString = T.substring(0,T.length()-1);
        if(S.equals(actualString)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
