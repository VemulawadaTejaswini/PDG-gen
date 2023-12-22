import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  
    Map<String, Integer> week = new HashMap<>();
    week.put("SUN", 1);
    week.put("MON", 2);
    week.put("TUE", 3);
    week.put("WED", 4);
    week.put("THU", 5);
    week.put("FRI", 6);
    week.put("SAT", 7);
    
    int temp = week.get(br.readLine());
    temp++;
    int result = 1;
    while (temp%7 != 1){
      temp++;
      result++;
    }
    System.out.println(result);
  }
}