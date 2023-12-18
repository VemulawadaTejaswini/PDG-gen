import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main{
  public static void main(String[] args)throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int numAll = Integer.parseInt(br.readLine());
    String[] dataStr = br.readLine().split(" ");
    int data = 0;
    
    for(int i=0; i<numAll; i++){
      data = Integer.parseInt(dataStr[i]);
      if((data%2 == 0 && data%3 != 0) && (data%2 == 0 && data%5 != 0)){
        System.out.println("DENIED");
        return;
      }
    }
    System.out.println("APPROVED");
  }
}