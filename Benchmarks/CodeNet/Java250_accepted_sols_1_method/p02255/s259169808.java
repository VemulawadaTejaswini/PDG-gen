import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
 
public class Main {
 
    public static void main(String[] args) throws Exception {
        
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuffer sb = new StringBuffer();
    	
        int count = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
 
        for (int i = 1; i < count; i++) {
            System.out.println(String.join(" ",str));
            for (int j = i - 1; j >= 0; j--) {
                if (Integer.parseInt(str[j]) > Integer.parseInt(str[j + 1])) {
                    String tmpNum = str[j];
                    str[j] = str[j + 1];
                    str[j + 1] = tmpNum;
                }
            }
        }
        System.out.println(String.join(" ",str));
    }
}