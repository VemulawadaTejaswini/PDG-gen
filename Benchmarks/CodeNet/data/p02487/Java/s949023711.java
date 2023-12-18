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

          for(int a=0; a<W; a++){
            System.out.print("#");
          }
          System.out.println();

          for(int b=0; b<(H-2); b++){
              System.out.print("#");
              for(int c=0; c<(W-2); c++){
                System.out.print(".");
              }
              System.out.println("#");
          }

          for(int d=0; d<W; d++){
            System.out.print("#");
          }
          System.out.println();
          System.out.println();

        }
    }
}