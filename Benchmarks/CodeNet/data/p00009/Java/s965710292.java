import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> sosuList = new ArrayList<Integer>();

        String s;
        while ((s = br.readLine()) != null) {
            if(s.length()==0) break;
            IntStream.range(2, Integer.valueOf(s)+1).forEach(j->{
                if(!sosuList.stream().anyMatch(i->{return j%i==0;})) {
                    sosuList.add(j);
                }
            });
            System.out.println(sosuList.size());
        }
    }
}