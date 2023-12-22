import java.io.*;
import java.util.*;

class Main{
    public static void main(String args[])throws IOException{
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H","I", "J", "K", "L", "M", "N", "O", "P", "Q","R", "S", "T", "U", "V", "W", "X", "Y", "Z"));
        StringBuilder sb = new StringBuilder();

        String num_s = br.readLine();
        int num = Integer.parseInt(num_s);
        String str = br.readLine();
       
        for(int i=0; i < str.length(); i++){
          int index = list.indexOf(String.valueOf(str.charAt(i)));
          int tmp = index + num;
          if(tmp > list.size() - 1){
            tmp = tmp - (list.size() - 1) - 1;
          }
          sb.append(list.get(tmp));
        }

        System.out.println(sb);
      }
    }
}