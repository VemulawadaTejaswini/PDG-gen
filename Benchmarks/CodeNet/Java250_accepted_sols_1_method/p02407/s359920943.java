import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line1 = br.readLine();
        String line2 = br.readLine();
        String str;
        
        int num = Integer.parseInt(line1);
        String aryNum[] = new String[num];
        aryNum = line2.split(" ");
        
        for (int i = num - 1; i > -1; i--) {
            System.out.print(aryNum[i]);
            if(i != 0){
                System.out.print(" ");
            }
        }

        System.out.println("");
    }
}