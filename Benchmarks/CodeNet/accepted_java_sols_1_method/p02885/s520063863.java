import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Integer; 

public class Main {
    public static void main(String[] args) {
 
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
 
        String str = null;
        try {
            str = br.readLine();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] curtain = str.split(" ");
        Integer nagasa = Integer.parseInt(curtain[0]);
        Integer curtainNagasa = Integer.parseInt(curtain[1]);
        int curtainLong = curtainNagasa * 2;
        if (nagasa > curtainLong) {
            nagasa = nagasa - curtainLong;
        } else {
            nagasa = 0;
        }
        System.out.println(nagasa);
    } 
}