import java.util.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	int n = scan.nextInt();
      	long answer = 0;
      	Map<String, Long> map = new HashMap<>();
      	for(int i = 0 ; i < n ; i ++){
        	String s = scan.next();
          	String[] k = s.split("");
          	Arrays.sort(k);
          	String sortedstr = String.join("", k);
          	//String sortedstr = new String(k);
          	if(map.containsKey(sortedstr)){
              	answer += map.get(sortedstr);
          		map.put(sortedstr, (map.get(sortedstr) + 1)); 	
            }
          	else{
            	map.put(sortedstr, (long)1);
            }
        }
      	
      	System.out.print(answer);
    }
}