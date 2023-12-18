import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    long sum=0;
    boolean res=true;
    Map<Long,Long> map=new TreeMap<>();
    for(int i=0;i<n;i++) {
    	long a=sc.nextLong(),b=sc.nextLong();
    	if(map.containsKey(b)) {
    		map.put(b, map.get(b)+a);
    	}else {
    		map.put(b, a);
    	}
    }
    for(Long key : map.keySet()){
    	sum+=map.get(key);
    	if(key<sum) {
    		res=false;
    		break;
    	}
    	//System.out.println(sum);
    }
    if(res) {
    	System.out.println("Yes");
    }else {
    	System.out.println("No");
    }
  }
}
