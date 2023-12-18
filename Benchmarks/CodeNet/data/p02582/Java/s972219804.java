import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    String weather = args[0];
    int k = 0;
    List<String> weathers = Arrays.asList(weather.split(","));
    if(weathers.get(0).equals("R")) {
      k++;
      if(weathers.get(1).equals("R")) {
        k++;
        if(weathers.get(2).equals("R")) {
          k++;
        }
      }
    }
    System.out.print(k);
  }
}