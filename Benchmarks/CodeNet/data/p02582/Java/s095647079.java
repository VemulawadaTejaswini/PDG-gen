import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
class Main{
  public static void main(String[] args) {
    try {
        var stdin = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        while((line = stdin.readLine()) == null);
        if (line.equals("SSS") ) {
            System.out.println("0");
        } else if(line.equals("SSR") || line.equals("SRS") || line.equals("RSS") || line.equals("RSR")) {
            System.out.println("1");
        } else if (line.equals("RRR") ){
            System.out.println("3");
        } else {
            System.out.println("2");
        }
    } catch(Exception e) {
    }
   
  }
}