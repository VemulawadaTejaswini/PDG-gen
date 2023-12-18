import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

  public static void main(String [] args)throws IOException{
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int casos = Integer.parseInt(br.readLine());
    
    for(int i = 0; i < casos;i++){
      
      StringTokenizer st = new StringTokenizer(br.readLine());
      int [] l = new int [3];
      
      for(int t = 0; t < 3; t++)
        l[t] = Integer.parseInt(st.nextToken());
      
      Arrays.sort(l);
      
      if(l[0]*l[0] + l[1]*l[1] == l[2]*l[2])
        System.out.println("YES");
      else
        System.out.println("NO");        
    
    }
    
  }  
}