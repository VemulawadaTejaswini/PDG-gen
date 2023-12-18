import java.io.BufferedReader;
import java.io.IOException;
import java.io.*;
 
 
public class Main {
    public static void main(String[] args) throws IOException{
         
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int fNum = 0;  //????¨??????????x????????????????????????????????????????????????
        
        while(true){
        String[] input = br.readLine().split(" ");
         
        int n = Integer.parseInt(input[0]);
        int x = Integer.parseInt(input[1]);
       
        if(x == 0 && n == 0){
            break;
        }else{
            for(int i = 1; i <= n; i++ ){
                for(int j = i + 1; j <= n; j++ ){
                    for(int k = j + 1; k <= n; k++ ){
                        if((i + j + k) == x){
                            fNum++;
                        }
                    }
                }
            }
          }
      }
        System.out.println(fNum);
    }
     
}