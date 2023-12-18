import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String w = br.readLine();
        int sum = 0;
        String line="";
        while (!(line = br.readLine()).equals("END_OF_TEXT")) {
            for(String s:line.split(" ")){
                if(s.equalsIgnoreCase(w)){
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }
}