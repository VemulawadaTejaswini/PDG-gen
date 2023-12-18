import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
 
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] counter = new int[26];

        String line;
        while((line = br.readLine()) != null) {
            char[] charArray = line.toLowerCase().toCharArray();
            for(int i = 0; i < charArray.length; i++) {
                if(charArray[i] < 'a' || charArray[i] > 'z') {
                    continue;
                }
                counter[charArray[i]-'a']++;
            }
        }
 
        for(int i = 0; i < counter.length; i++) {
            System.out.println((char)('a' + i) + " : " + counter[i]);
        }
    }
}
