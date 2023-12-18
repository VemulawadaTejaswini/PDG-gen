import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{

  public static void main(String [] args)throws IOException{
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int [] num = new int[37];
    for(int a = 0; a <= 9; a++)
      for(int b = 0; b <= 9; b++)
        for(int c = 0; c <= 9; c++)
          for(int d = 0; d <= 9; d++) 
             num[a+b+c+d]++;
    String ln ="";
    while((ln = br.readLine())!= null)
      System.out.println(num[Integer.parseInt(ln)]);    
       
    
    }
    
}  