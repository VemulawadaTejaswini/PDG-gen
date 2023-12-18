import java.io.*;
import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) throws IOException{
		
		int n = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
    for(int i=0;i < n;i++){
    	
    	Scanner scanner = new Scanner(br.readLine());
    	//ftHÅNMà¶ÍXy[X
    	
    	float xa = scanner.next();
    	float ya = scanner.next();
    	float ra = scanner.next();
    	float xb = scanner.next();
    	float yb = scanner.next();
    	float rb = scanner.next();
    	
    	float distance = (xa - xb)*(xa - xb) + (ya - yb)*(ya - yb);
    	
    	if(distance > (ra+rb)*(ra+rb)){
    			System.out.println(0 + "");
    	}else if(distance > (ra-rb)*(ra-rb)){
    			System.out.println(1 + "");
    	}else{
    			if(ra > rb){
    				System.out.println(2 + "");
    			}else{
    				System.out.println(-2 + "");
    			}
    	}
    	
  	}
	}

}