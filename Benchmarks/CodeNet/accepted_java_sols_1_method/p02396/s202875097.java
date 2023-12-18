import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
 
class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String t = "";
        int i = 1;
        t =  reader.readLine();
        while(!t.equals("0")){
            System.out.println("Case " + i + ": " + t);
            i++;
            t = reader.readLine();
        }
    }
}