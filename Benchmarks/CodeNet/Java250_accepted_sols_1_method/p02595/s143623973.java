import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String line = stdin.readLine();
        String[] temp = line.split(" ");
        int number = Integer.parseInt(temp[0]);
        int distance = Integer.parseInt(temp[1]);

        int count = 0;
        for(int i = 0 ; i < number; i++){
            line = stdin.readLine();
            temp = line.split(" ");
            double x = Double.parseDouble(temp[0]);
            double y = Double.parseDouble(temp[1]);
            double d =   Math.sqrt(x*x + y*y);
            if(d<=distance)
                count++;
        }

        System.out.println(count);
    }

} 
