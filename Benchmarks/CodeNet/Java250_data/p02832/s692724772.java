import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
          //input
          int num = Integer.parseInt(br.readLine());
          String[] block = br.readLine().split(" ");

          // for search
          int count = 1;
          List<Integer> list = new ArrayList<>();

          // search
          for(int i = 0; i < num; i++){
            if(Integer.parseInt(block[i]) == count){
              list.add(i);
              count++;
            }else{
              continue;
            }
          }

          if(list.size() == 0){
            System.out.println("-1");
          }else{
            System.out.println(num - list.size());
          }
      }
    }
}