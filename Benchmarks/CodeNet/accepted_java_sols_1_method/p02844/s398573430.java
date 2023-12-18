import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int ketasu = sc.nextInt();
    String secret = sc.next();

    String[] pin = new String[ketasu];

    for(int i = 0; i < ketasu; i++)
      pin[i] = secret.substring(i, i+1);

    int count = 0;

    for(int i = 999; i >= 0; i--){
      String line = String.format("%03d", i);
      int point = 0;
      for(int j = 0; j < pin.length; j++){
        if(pin[j].equals(line.substring(point, point+1))){
          point++;
        }
        if(point == 3){
          count++;
          break;
        }
      }
    }

    System.out.println(count);
  }
}