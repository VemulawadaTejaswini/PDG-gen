import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = null;
        PrintWriter writer = null;
        
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            writer = new PrintWriter(System.out);
            
            int N = Integer.parseInt(br.readLine());
            int[] a = Arrays.asList(br.readLine().split(" ")).stream()
                                                .mapToInt(e -> Integer.parseInt(e))
                                                .toArray();
            
            Arrays.sort(a);
            
            int AliceSum = 0, BobSum = 0;
            Boolean flg = true;
            
            for(int i = a.length - 1; i >= 0; i--){
                if(flg){
                    AliceSum += a[i];
                    flg = false;
                }else{
                    BobSum += a[i];
                    flg = true;
                }
                
            }
            writer.println(AliceSum - BobSum);
            
        }finally{
            if(br != null){
                br.close();
            }
            if(writer != null){
                writer.close();
            }
        }

    }
}