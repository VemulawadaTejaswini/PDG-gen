import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        for(;;){
          String line = buf.readLine();
          int H = Integer.parseInt(line.split(" ")[0]);
          int W = Integer.parseInt(line.split(" ")[1]);
          if(H == 0 && W == 0){
            break;
          }

          for(int j=0; j<W; j++){
            for(int i=0; i<H; i++){
              System.out.print("#");
            }
            System.out.println();
          }
          System.out.println();
        }
    }
}