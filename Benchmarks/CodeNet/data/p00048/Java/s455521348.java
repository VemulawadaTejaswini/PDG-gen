import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            final String line = br.readLine();
            if (line == null) break;
            double weight = Double.parseDouble(line);
            if (weight<=48.00){
                System.out.println("light fly");
            }else if (48.00<weight && weight<=51.00){
                System.out.println("fly");
            }else if (51.00<weight && weight<=54.00){
                System.out.println("bantam");
            }else if (54.00<weight && weight<=57.00){
                System.out.println("feather");
            }else if (57.00<weight && weight<=57.00){
                System.out.println("light");
            }else if (60.00<weight && weight<=64.00){
                System.out.println("light welter");
            }else if (64.00<weight && weight<=69.00){
                System.out.println("welter");
            }else if (69.00<weight && weight<=75.00){
                System.out.println("light middle");
            }else if (75.00<weight && weight<=81.00){
                System.out.println("middle");
            }else if (81.00<weight && weight<=91.00){
                System.out.println("light heavy");
            }else if (weight>91.00){
                System.out.println("heavy");
            }
        }
    }
}