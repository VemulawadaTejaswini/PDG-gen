import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
          String[] str = br.readLine().split(" ");
          int X = Integer.parseInt(str[0]);
          int Y = Integer.parseInt(str[1]);

          int tmp = 0;
          int result = 0;
          boolean flag = false;
    
          for(int i = 0; i <= X; i++){
            tmp = X-i;
            result = i*2 + tmp*4;
            if(result == Y){
              flag = true;
              break;
            }
          }

          if(flag){
            System.out.println("Yes");
          }else{
            System.out.println("No");
          }
        }

    }
}