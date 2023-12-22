import java.io.*;

public class Main{
	public static void main(String[] args) throws Exception{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int k = Integer.parseInt(br.readLine());
      
      int val=0;
      int ans = -1;
      
      for(int i = 1 ; i <= 1e6 ; i++){
       	val = val * 10 + 7;
        
        if(val % k == 0){
         	ans = i;
          break;
        }
        
        val = val%k;
      }
      
      System.out.println(ans);
    }
}