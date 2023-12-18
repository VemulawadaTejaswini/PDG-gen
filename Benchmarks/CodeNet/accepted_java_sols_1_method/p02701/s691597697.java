import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    HashMap map = new HashMap();
    for (int i=0;i< n;i++){
    	String key=sc.next();
    	if (!map.containsKey(key)){
    		map.put(key,key);
    	}
    }

    System.out.println(map.size());
  }
}
