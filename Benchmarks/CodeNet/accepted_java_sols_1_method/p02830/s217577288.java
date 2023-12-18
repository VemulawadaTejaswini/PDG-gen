import java.io.*;
import java.util.*;

class Main{
    public static void main(String args[])throws IOException{
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        //input
        int num = Integer.parseInt(br.readLine());        
        String[] str = br.readLine().split(" ");
        String[] str_1 = str[0].split("");
        String[] str_2 = str[1].split("");

        // for algorithim
        StringBuilder sb = new StringBuilder();

        // algorithm
        for(int i = 0; i < num; i++){
          sb.append(str_1[i]);
          sb.append(str_2[i]);
        }

        System.out.println(sb);
      }

    }
}