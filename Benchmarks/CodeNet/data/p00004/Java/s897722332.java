import java.io.BufferedReader;
import java.io.InputStreamReader;
  
public class Main {
  
    public static void main(String[] args) throws Exception {
        BufferedReader br = 
                new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        while(str != null){
            String lns[] = str.split(" ");
            int a = Integer.parseInt(lns[0]);
            int b = Integer.parseInt(lns[1]);
            int c = Integer.parseInt(lns[2]);
            int d = Integer.parseInt(lns[3]);
            int e = Integer.parseInt(lns[4]);
            int f = Integer.parseInt(lns[5]);

            System.out.println(a + " " + b + " " + c +  " " + d +  " " + e + " " + f );
            str = br.readLine();
        }
        // System.out.println(String.format("%d:%d:%d", hour, min, sec));
    }
}