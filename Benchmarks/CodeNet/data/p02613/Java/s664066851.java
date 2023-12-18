import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
      	int ac = 0;
      	int wa = 0;
      	int tle = 0;
      	int re = 0;
	  	List<String> jugdges = new ArrayList<String>();
      	for(int i = 0; i < N; i++){
	 		judges.add(sc.nextLine());
      	}
      	for(String str: judges){
        	switch(str){
          		case "AC":
            		ac ++;
          		case "WA":
            		wa ++;
          		case "TLE":
            		tle ++;
          		case "RE":
            		re ++;
        	}
      	}   
      	System.out.println("AC x " + ac );
      	System.out.println("WA x " + wa );
      	System.out.println("TLE x " + tle );
      	System.out.println("RE x " + re );
      
	}
}