
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        Map<String,Integer> frequencies = new HashMap<>();

        String[] verdicts = {"WA","AC","TLE","RE"};
        for(String verdict:verdicts)frequencies.put(verdict,0);
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            String verdict  = br.readLine();
            frequencies.put(verdict,frequencies.getOrDefault(verdict,0)+1);
        }
        System.out.println("AC" + " x " +frequencies.get("AC"));
        System.out.println("WA" + " x " +frequencies.get("WA"));
        System.out.println("TLE" + " x " +frequencies.get("TLE"));
        System.out.println("RE" + " x " +frequencies.get("RE"));
    }
}
