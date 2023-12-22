import java.util.*;
 
public class Main {
  
  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int N = sc.nextInt();
	    int A[] = new int[N];
	    
	    List<Integer> list = new ArrayList<>();
	    
	    for(int i=0; i<N; i++) {
			A[i]= sc.nextInt();
			list.add(A[i]);
		}
	    
	    Collections.sort(list);
	    
	    for(int i=0; i<N; i++) {
	    	if(A[i]==list.get(N-1)) {
	    		System.out.println(list.get(N-2));
	    	}else {
	    		System.out.println(list.get(N-1));
	    	}
	    }
	    
	} 

}