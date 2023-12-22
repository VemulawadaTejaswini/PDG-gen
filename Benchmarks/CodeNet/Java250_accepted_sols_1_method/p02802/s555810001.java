import java.util.*;
import java.lang.Math;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
  		
      	int n = sc.nextInt();
      	int m = sc.nextInt();
      	List acList = new ArrayList<String>();
      	boolean  acs[] = new boolean[n];
      	int was[] = new int[n];
      	int istack;
      	String sstack;
      	String sstack2;
      	int ac = 0;
      	int wa = 0;
      
      	Arrays.fill(acs,false);
      	Arrays.fill(was,0);
      	
      	for(int i = 0;i < m;i++){
        	istack = sc.nextInt() - 1;
          	sstack = sc.next();
          	if(sstack.equals("AC") && !acs[istack]){
              ac++;
              acs[istack] = true;
              wa += was[istack];
            } else was[istack]++;
        }
      
        System.out.print(ac + " ");
      	System.out.println(wa);
             	
        
	}
}
