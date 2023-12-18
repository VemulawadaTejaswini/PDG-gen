import java.awt.SystemTray;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line = reader.readLine();
            int time = Integer.parseInt(line);
            int seconds = time % 60;
            int minutes2 = (time - seconds)/60;
            int minutes = minutes2 % 60;
            int hours = minutes2 / 60;
            System.out.println(hours+":"+minutes+":"+seconds);
        }  catch (IOException e) {
            System.out.println(e);
        }  
    }
}
