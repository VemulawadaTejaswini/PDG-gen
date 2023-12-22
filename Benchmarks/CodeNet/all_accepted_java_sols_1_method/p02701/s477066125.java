import java.util.*;
class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int T =sc.nextInt();
      HashMap<String, Integer> map = new HashMap<>();
      for(int i =0; i<T;i++){
      	String a =sc.next();
        if( map.containsKey(a))
          	continue;
        else
          map.put(a,0);
      }
      System.out.println(map.size());
    }
}