import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        String target = br.readLine().toLowerCase();
        while(true) {
            String line = br.readLine();
            String[] line2 = line.split(" ");
            if(line2[0].equals("END_OF_TEXT"))break;
            for(int i=0;i<line2.length;i++){
                String s= line2[i].toLowerCase();
                if(s.equals(target))count++;
            }
        }
        System.out.println(count);
    }
}