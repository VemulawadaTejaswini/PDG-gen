import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
        int n = sc.nextInt();
     	int count = 0,check;
        String tmp ;
        Map<String,Integer> map = new TreeMap<>();
        for(int i = 0;i < n;i++){
          tmp = sc.next();
          if(map.containsKey(tmp)){
            check = map.get(tmp) + 1; 
          }else{
            check = 1;
          }
          map.put(tmp,check);
          count = Math.max(count,check);
        } 
      
        for(var ans : map.entrySet()){
          if(count == ans.getValue()){
            System.out.println(ans.getKey());
          }else{
          }
        }
    }
}