import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  int n=sc.nextInt();
	  Map<Long,Long> map=new TreeMap<>();
	  long s=0;
	  for(int i=0;i<n;i++) {
		  long key=sc.nextLong();
		  if(map.containsKey(key)) {
			  map.put(key, map.get(key)+1);
		  }else {
			  map.put(key, 1L);
		  }
		  s+=key;
	  }
	  int q=sc.nextInt();
	  for(int i=0;i<q;i++) {
		  long buff=0;
		  long b=sc.nextLong(),c=sc.nextLong();
		  if(map.containsKey(b)) {
			  if(map.containsKey(c)) {
				  map.put(c, map.get(b)+map.get(c));
				  buff=(c-b)*map.get(b);
				  map.put(b,0L);
			  }else {
				  map.put(c, map.get(b));
				  buff=(c-b)*map.get(b);
				  map.put(b,0L);
			  }
		  }
		  s+=buff;
		  System.out.println(s);
	  }
  }
}

