import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
      	int ac = 0;
      	int wa = 0;
      	int tle = 0;
      	int re = 0;
	  	List<String> judges = new ArrayList<String>();
      	for(int i = 0; i <= N; i++){
	 		judges.add(sc.nextLine());
      	}
      	for(String str: judges){
        	switch(str){
          		case "AC":
            		ac ++;
                	break;
          		case "WA":
            		wa ++;
                	break;
          		case "TLE":
            		tle ++;
                	break;
          		case "RE":
            		re ++;
                	break;
        	}
      	}   
      	System.out.println("AC x " + ac );
      	System.out.println("WA x " + wa );
      	System.out.println("TLE x " + tle );
      	System.out.println("RE x " + re );
      
	}
}