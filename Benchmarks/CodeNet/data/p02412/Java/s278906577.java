import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
class Main{
  public static void main(String args[]) throws IOException{
   int ans = 0;
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
   while(true){
   String[] token = br.readLine().split(" ");
    int n = Integer.parseInt(token[0]);      
    int x = Integer.parseInt(token[1]);
    if(n == 0 && x == 0) {break;}
    for(int i = 1; i <= n ; i++){
     for(int j = i + 1; j <= n; j++){
      for(int k = j + 1; k <= n; k++){
       if(i+j+k==x){ans++;}
      }//for 
     }//for
    }//for
  
   }//while
  System.out.println(ans);
 }
}