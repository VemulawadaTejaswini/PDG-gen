import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
      
        List<Integer> div = new ArrayList<Integer>();
        for(int i=0;i<N;i++){
          div.add(sc.nextInt());
        }
          
        Collections.sort(div);
      
      int max = div.get(div.size()-1);
      for(int i=0;i<div.size();i++){
        int now = div.get(i);
        boolean delFlg = false;
        if(now == div.get(i+1)){
          div.removeAll(new ArrayList<Integer>(Arrays.asList(now)));
          i--;
        }
        if(now > Math.sqrt(max)){
          continue;
        }
        for(int j=i+1;j<div.size();j++){
          if(div.get(j)%now == 0){
            div.remove(j);
            j--;
          }
        }
      }
      
      System.out.println(String.valueOf(div.size()));
    }
}