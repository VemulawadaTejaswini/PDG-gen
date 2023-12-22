import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String line = br.readLine();
    int front = Integer.parseInt(line.substring(0, 2));
    int rear = Integer.parseInt(line.substring(2, 4));
    
    String result = "NA";
    
    if(front>=1 && front<=12 && rear>=1 && rear<=12){
      result = "AMBIGUOUS";
    }else if (rear>=1 && rear<=12){
      result = "YYMM";
    }else if(front>=1 && front<=12){
      result = "MMYY";
    }
    
    System.out.println(result);
  }
}
