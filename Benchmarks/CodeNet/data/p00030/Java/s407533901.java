import java.io.*;
import java.util.StringTokenizer;
public class Main{
     
  
  public static int rec(int n,int k){    
    int r = 0;
    for(int i = 1 ; i < (1 << 10);i++){
      int c = Integer.bitCount(i);
      int sum = 0;
      if(c == n)
        for(int j = 0; j < 10; j++)
            if((i & (1 << j)) != 0)
              sum += j;
      if(sum == k)
        r++;       
    }    
    return r;  
  } 
  
  public static void main(String [] args)throws IOException{
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    
    while(true){
      st = new StringTokenizer(br.readLine());
      int n = Integer.parseInt(st.nextToken());
      int k = Integer.parseInt(st.nextToken());
      if( n == 0 && k == 0) 
        break;
      System.out.println(rec(n,k));   
    }  
  }


}