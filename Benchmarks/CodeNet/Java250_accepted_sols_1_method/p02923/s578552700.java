import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    ArrayList<Integer> list = new ArrayList<Integer>();
    for(int i = 0; i < n; i++){
      list.add(sc.nextInt());
    }
    
    int maxCnt = 0;
    int cnt = 0;
	
    for(int i = 0; i < list.size() - 1; i++){
      int target = i;
      for(int j = i + 1; j < list.size(); j++){
        if(list.get(target + 1) <= list.get(target)){
          cnt++;
          target++;
        }else{
          break;
        }
      }
      if(cnt > maxCnt){
        maxCnt = cnt;
      }
      i += cnt;
      cnt = 0;
    }
    System.out.println(maxCnt);
  }
}