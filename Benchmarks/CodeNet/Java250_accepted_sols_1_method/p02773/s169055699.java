import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main{
  public static void main(String[] args)throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int numVote = Integer.parseInt(br.readLine());
    String data;
    Map<String, Integer> voteNumList = new HashMap<>();
    Set<String> nameSet = new HashSet<>();
    
    
    for(int i=0; i<numVote; i++){
      String name = br.readLine();
      if(voteNumList.containsKey(name)){
        voteNumList.put(name, voteNumList.get(name) + 1);
      } else {
        voteNumList.put(name, 1);
        nameSet.add(name);
      }
    }
    
    Set<String> result = new HashSet<>();
    int max = 0;
    
    for(String s: nameSet){
      int n = voteNumList.get(s);
      if(n > max){
        result = new HashSet<>();
        max = n;
        result.add(s);
      } else if (n == max){
        result.add(s);
      }
    }
  
    Object[] resultList = result.stream()
        .sorted()
        .toArray();
    
    StringBuilder str = new StringBuilder();
    for(Object s: resultList){
      str.append(s);
      str.append("\n");
    }
    System.out.println(str);
  }
}
