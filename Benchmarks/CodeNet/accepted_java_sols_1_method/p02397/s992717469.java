import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();

        while(true){
            String input = br.readLine();
            String[] strArray = input.split(" ");

            int x = Integer.parseInt(strArray[0]);
            int y = Integer.parseInt(strArray[1]);

            int changeBox;

            if(x == 0 && y == 0){
                break;
            }

            if(x > y){
                changeBox = x;
                x = y;
                y = changeBox;
            }
            output.append(Integer.toString(x)).append(" ").append(Integer.toString(y)).append("\n");
        }
            System.out.print(output);
    }
}