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
      
      for(int i=0;i<div.size()-1;i++){
        int now = div.get(i);
        if(now == div.get(i+1)){
          div.removeAll(new ArrayList<Integer>(Arrays.asList(now)));
          i--;
        }
        if(div.size() == 0){
          break;
        }
        if(div.get(div.size()-1)/2 < now){
            continue;
        }
        for(int j=div.size()-1;j>i;j--){
          if(div.get(j)%now == 0){
            div.remove(j);
          } else if(div.get(j)/2 < now){
            break;
          }
        }
      }
      
      System.out.println(String.valueOf(div.size()));
    }
}