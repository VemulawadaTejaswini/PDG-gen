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
      
      for(int i=0;i<div.size();i++){
        int now = div.get(i);
        boolean delFlg = false;
        for(int j=i+1;j<div.size();j++){
          if(now == div.get(j)){
            delFlg = true;
            div.remove(j);
            j--;
          } else if(div.get(j)%now == 0){
            div.remove(j);
            j--;
          }
        }
        if(delFlg){
          div.remove(i);
          i--;
        }
      }
      
      System.out.println(String.valueOf(div.size()));
    }
}