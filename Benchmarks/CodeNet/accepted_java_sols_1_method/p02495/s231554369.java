import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        for(;;){
          String line = buf.readLine();
          int H = Integer.parseInt(line.split(" ")[0]);
          int W = Integer.parseInt(line.split(" ")[1]);
          if(H == 0 && W == 0) break;

          StringBuilder sb = new StringBuilder();
            for(int a=0; a<H; a++){
              for(int b=0; b<W; b++){
                if((a+b)%2 == 0){
                  sb.append("#");
                }else{
                  sb.append(".");
                }
              }
              sb.append("\n");
            }
            System.out.println(sb);
          }
        }
      }