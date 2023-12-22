import java.io.*;
import java.util.*;

class Main{
    public static void main(String args[])throws IOException{
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        int N = Integer.parseInt(br.readLine());
        String[] str = new String[N];
        
        for(int i = 0; i < N; i++){
          str[i] = br.readLine();
        }

        Map<String, Integer> map = new HashMap<>();
        int value = 0;  
        int max = 1;     
        
        for(int i = 0; i < N; i++){
          if(map.size() == 0){
            map.put(str[i], 1);
          }else{
            if(map.containsKey(str[i])){
              value = map.get(str[i]);
              value += 1;
           
              if(max < value){
                max = value;
              }

              map.put(str[i], value);
            }else{
              map.put(str[i], 1);
            }
          }
        }

        List<String> list = new ArrayList<>();

        for(Map.Entry<String, Integer> entry : map.entrySet()){
          if(max == entry.getValue()){
            list.add(entry.getKey());
          }
        }

        Collections.sort(list);

        for (String string : list) {
          System.out.println(string);
        }

      }
    }
}