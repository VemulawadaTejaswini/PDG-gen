import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Main {

  public static void main(String[] args) throws IOException {
    
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      String line;
      int num;
      int result;
      List<Integer> list = new LinkedList<>(); 
      while(true) {

        if( ((line = br.readLine()) == null) || line.isEmpty() ) break;

        num = Integer.parseInt(line);
        if( num == 0 || num == 1) {
          result = 0;
          System.out.println(result);
          continue;
        }
        
        result = 0;
        list.clear();
        for ( Integer i = 2; i <= num; i++ ) {
          list.add(i);
        }
        for( int i = 0; i <= Math.sqrt(num); i++) {
          for( int j = i+1; j < list.size(); j++) {
            if(list.get(j) % list.get(i) == 0) list.remove(j);
          }
        }
        result = list.size();
        System.out.println(result);
      }
    }
  }

  public static boolean isPrime(int num) {
    for( int i = 2; i < num; i++ ) {
      if( num % i == 0) return false;
    }
    return true;
  }
}
