import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
 
class Prg {
    public static void main(String args[]) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String t = "";
        int i = 1;
        t =  reader.readLine();
        while(!t.equals("0")){
            t =  reader.readLine();
            System.out.println("Case " + i + ": " + t);
        }
    }
}