import java.util.Scanner;
import java.util.TreeMap;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	 
	    TreeMap <Integer, Integer> store = new TreeMap <Integer, Integer>();
	    
	    for (int i=0; i<N; i++){
	    	int A =sc.nextInt();
	    	int B =sc.nextInt();
	    	
	    	if (store.containsKey(B)) 
				store.put(B, store.get(B) + A);
			 else 
				store.put(B, A);
	    	
	    }
	    int time = 0;
	    
	   
	    //System.out.println(store.entrySet());
	    
	    
	    while (store.isEmpty()!=true){
	    	int lim = store.firstKey();
	    	int task = store.get(lim);
	    	
	    	//System.out.println(lim);
	    	//System.out.println(task);
	    	
	    	if (time+task<=lim){
	    		time+=task;
	    		store.remove(lim, task);
	    	}
	    	
	    	else {
	    		time = -1;
	    		break;
	    	}
	    }
	    if (time == -1)
	    	System.out.println("No");
	    
	    else
	    	System.out.println("Yes");
	    
	    

	}

}
