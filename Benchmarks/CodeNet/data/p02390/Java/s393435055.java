import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int readS = Integer.parseInt(reader.readLine());
    
    int hour = readS / 3600;
    readS -= hour * 3600;
    int minutus = readS / 60;
    readS -= minutus * 60;
    int second = readS;
    
    System.out.println(hour+":"+minutus+":"+second);
  }

}