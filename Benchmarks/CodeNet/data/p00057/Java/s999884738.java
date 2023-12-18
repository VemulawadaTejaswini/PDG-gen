import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
 
public class Main {
    private static  BufferedReader  br = null;
 
    static {
        br   = new BufferedReader(new InputStreamReader(System.in));
    }
 
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String  strin = null;
        int     lines = 0;
 
        while ((strin = parseNum()) != null) {
            lines = Integer.parseInt(strin);
            System.out.println(lines * (lines + 1) / 2 + 1);
        }
    }
 
    private static String parseNum() {
        String  strNum = null;
 
        try {
            String line = br.readLine();
            if (line != null) {
                if (!line.isEmpty()) {
                    strNum = line;
                }
            }
        }
        catch (IOException e) {}
 
        return strNum;
    }
}