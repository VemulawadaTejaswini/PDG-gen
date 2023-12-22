import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    TreeMap<String, Integer> paper = new TreeMap<>();
    int max = 1;
    for(int i=0; i<N; i++){
      String tmp = sc.next();
      if(paper.containsKey(tmp)){
        paper.put(tmp, paper.get(tmp) + 1);
        max = Math.max(max, paper.get(tmp));
      }else{
        paper.put(tmp, 1);
      }
    }
    for(String key: paper.keySet()){
      if(max == paper.get(key)){
        System.out.println(key);
      }
    }
  }
}
    
        
