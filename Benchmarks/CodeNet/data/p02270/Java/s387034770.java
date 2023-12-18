import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        BufferedReader br_allc = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            int[] array = createListInt(br_allc);
            int n = array[0];
            int m = array[1];
            int[] weighList = new int[n];
            
            int sum_weigh = 0;
            int maximum   = 0;
            
            for(int i = 0; i < n; i++) {
                weighList[i] = ip(br_allc);
                sum_weigh += weighList[i];
                maximum = Math.max(maximum, weighList[i]);
            }
            
            int lisLeft  = maximum;
            int lisRight = sum_weigh;
            
            while(lisLeft < lisRight) {
                int lisMid = (lisLeft + lisRight) / 2;
                int index  = 0;
                sum_weigh  = 0;
                
                for(int i = 0; i < n; i++) {
                    if(sum_weigh + weighList[i] > lisMid) {
                        sum_weigh = weighList[i];
                        index++;
                    } else {
                        sum_weigh += weighList[i];
                    }
                    
                    if(index == m) {
                        break;
                    }
                }
                if(index == m) {
                    lisLeft = lisMid + 1;
                } else {
                    lisRight = lisMid;
                }
            }
            System.out.println(lisLeft);
            
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
    
    static boolean isNumber(String num) {
        return Pattern.compile("^\\-?[0-9]*\\.?[0-9]+$").matcher(num).find();
    }
    
    static int[] createListInt(BufferedReader br) throws IOException {
       
        String[] lines = br.readLine().split(" ");
        int n = lines.length;
        int[] list = new int[n];
        while(n-- > 0) {
            list[n] = Integer.parseInt(lines[n]);    
        }
        
        return list;
    }
    
    static int ip(BufferedReader s) throws IOException {
            return Integer.parseInt(s.readLine());
    }
}
