import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count =0;
        int line = Integer.parseInt(br.readLine());
        String[] search = new String[line];
        String[] line2 = br.readLine().split(" ");
        int line3 = Integer.parseInt(br.readLine());
        String[] line4 = br.readLine().split(" ");
        for(int i=0;i<line;i++) {
            for(int j=0;j<line3;j++) {
                if(line2[i].equals(line4[j])) 
                    count++;
            }
        }
        System.out.println(count);
    }
}