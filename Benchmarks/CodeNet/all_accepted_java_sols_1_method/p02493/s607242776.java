import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String line_1 = buf.readLine();
        int number = Integer.parseInt(line_1);

        String line_2 = buf.readLine();
        String[] scores = line_2.split(" ");
        for(; number != 0; number--){
          System.out.print(scores[number-1]);
          if(number == 1){
            break;
          }
          System.out.print(" ");
        }
        System.out.println();
    }
}