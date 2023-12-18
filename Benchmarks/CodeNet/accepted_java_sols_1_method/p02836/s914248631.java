import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        String[] str = br.readLine().split("");
        
        int i = 0;
        int j = str.length -1;
        int count = 0;

        while(i <= j){
          if(!(str[i].equals(str[j]))){
            count++;
          }
          i++;
          j--;
        }
        System.out.println(count);
      }
    }
}