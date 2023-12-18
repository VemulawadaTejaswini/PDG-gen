import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int lengs = Integer.parseInt(in.readLine());
        List<String> gaths = Arrays.asList(in.readLine().split(" "));
        int lengt = Integer.parseInt(in.readLine());
        List<String> gatht = Arrays.asList(in.readLine().split(" "));

        int i=0;
        for(String a: gatht){
            if(gaths.contains(a)) i++;
        }

        System.out.println(i);
        in.close();
    }
}