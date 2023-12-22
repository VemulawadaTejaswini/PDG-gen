import java.util.*;

public class Main
{
	public static void main (String[] args) 
	{
		
		Scanner scn = new Scanner(System.in);
    Map<Integer,Integer> map = new HashMap<Integer,Integer>();
    int n = scn.nextInt();
    int []arr = new int[n];
    for(int i=1;i<n;i++){
      arr[i] = scn.nextInt();
    }
    for(int i=1;i<arr.length;i++){
      if(map.containsKey(arr[i])){
        int val = map.get(arr[i]) + 1;
        map.put(arr[i],val);
      }else{
        map.put(arr[i],1);
      } 
 }
 
  for(int i=1;i<arr.length;i++){
  	if(map.containsKey(i)){
    int val = map.get(i);
    System.out.println(val);
  	}
    else
    System.out.println(0);
    
  }
      System.out.println(0);
		
		
	}
}