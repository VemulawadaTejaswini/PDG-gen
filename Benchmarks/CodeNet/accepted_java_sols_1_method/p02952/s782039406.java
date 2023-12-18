import java.io.*;

public class Main{
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String numStr = br.readLine();
    int n = Integer.parseInt(numStr);
    int result = 0;
    
    for(int i=numStr.length()-1; 0<i; i--) if( i%2 == 1 )
      result += (int)(Math.pow(10, i)-Math.pow(10, i-1));
    if( numStr.length() % 2 == 1 )
      result += n - Math.pow(10, numStr.length()-1) + 1;
    
    System.out.println(result);
  }
}
