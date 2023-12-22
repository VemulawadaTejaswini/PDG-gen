import java.io.*;
import java.util.*;

class Main{
    public static void main(String args[])throws IOException{
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        char[] alp = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',
                       'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 
                       'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
                       'y', 'z'};
        char input = br.readLine().charAt(0);

        int result = 0;

        for(int i = 0; i < alp.length; i++){
          if(alp[i] == input){
            result = i;
            break;
          }
        }

        System.out.println(alp[result+1]);
      }
    }
}
