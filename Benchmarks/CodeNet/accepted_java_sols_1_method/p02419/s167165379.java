import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String w = br.readLine();
        int sum = 0;
        while (true) {
            String line = br.readLine();
            if (line.equals("END_OF_TEXT")) {
                break;
            }
            line = line.toLowerCase();
            String[] lines=line.split(" ");
            for(String s:lines){
                if(s.contains(w)&&s.length()==w.length()){
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }
}