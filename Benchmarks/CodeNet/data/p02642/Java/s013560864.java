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
      boolean[] flg = new boolean[max+1]; 
      
      for(int i=0;i<div.size()-1;i++){
        int now = div.get(i);
        if(now == div.get(i+1)){
          flg[now] = true;
        }
        for(int j=now*2;j<max+1;j=j+now){
          flg[j] = true;
        }
      }
      
      int count = 0;
      for(int i=0;i<div.size();i++){
        if(!flg[div.get(i)]){
          count++;
        }
      }
      
      System.out.println(String.valueOf(count));
    }
}