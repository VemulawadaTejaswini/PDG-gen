import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        Map<String,Integer> frequencies = new HashMap<>();

        String[] verdicts = {"WA","AC","TLE","RA"};
        for(String verdict:verdicts)frequencies.put(verdict,0);
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            String verdict  = br.readLine();
            frequencies.put(verdict,frequencies.getOrDefault(verdict,0)+1);
        }
        for (Map.Entry verdictFrequency : frequencies.entrySet()){
            System.out.println(verdictFrequency.getKey()+" x "+verdictFrequency.getValue());
        }
    }
}