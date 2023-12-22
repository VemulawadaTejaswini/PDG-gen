import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      int[] raw = new int[10];
      for( int i=0; i<10; i++){
        raw[i] = Integer.parseInt(br.readLine());
      }
      int[] result = new int[] {-1,-1,-1};
      int target = -1;
      for(int i=0; i<3; i++) {
        for(int j=0; j<10; j++){
          if(result[i] < raw[j]) {
            result[i] = raw[j];
            target = j;
          }
        }
        raw[target] = -1;
      }

      for(int i=0; i<3; i++)
        System.out.println(result[i]);
    }
  }
}
