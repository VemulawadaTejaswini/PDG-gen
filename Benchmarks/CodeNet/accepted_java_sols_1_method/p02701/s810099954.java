import java.util.*;
public class Main{
  public static void main(String[] args){
  	Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    scn.nextLine();
	    String []arr = new String[n];
	    Map<String,Integer> map = new HashMap<String,Integer>();
	    for(int i=0;i<n;i++){
	      arr[i] = scn.nextLine();
	      if(map.containsKey(arr[i]))
	    	  map.put(arr[i], map.get(arr[i])+1);
	      else
	    	  map.put(arr[i],1);
	    }
	    int count = 0;
	    for(String s:map.keySet())
	    	count++;
	    System.out.println(count);
  }
}
