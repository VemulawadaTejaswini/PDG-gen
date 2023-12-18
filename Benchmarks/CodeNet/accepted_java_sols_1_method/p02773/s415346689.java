import java.util.*;
import java.lang.Math;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
  		
      	int n = sc.nextInt();
      	long count = 0;
      	long max = 1;
      	String sstack1;
      	String sstack2;
      	boolean fst = true;
        List wList = new ArrayList<String>();
      	List aList = new ArrayList<String>();
      	Map<String,Integer> wMap = new HashMap<String,Integer>();
      
      	for(int i = 0;i < n;i++){
          wList.add(sc.next());
        }
      	Collections.sort(wList);
      	wList.add("AC祈願");
      	sstack1 = (String)wList.get(0);
      	count = 1;
      	max = 1;
      	for(int i = 1;i < wList.size();i++){
          	sstack2 = (String)wList.get(i);
        	if(sstack1.equals(sstack2)) count++;
          	else{
              if(fst){
              	max = count;
              	aList.add(sstack1);
              	count = 1;
                fst = false;
              } else if(count == max){
              	aList.add(sstack1);
                count = 1;
              } else if(count > max){
                aList.clear();
                aList.add(sstack1);
                max = count;
                count = 1;
              } else count = 1;
            }
          	sstack1 = sstack2;
          	
        }
   
      	for(int i = 0;i < aList.size();i++){
          	System.out.println(aList.get(i));
        }      	
        
	}
}
