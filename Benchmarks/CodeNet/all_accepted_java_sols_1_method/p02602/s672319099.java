import java.util.*;

public class Main{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int k=sc.nextInt();
	    LinkedList<Long> l=new LinkedList<>();
	    
	    for(int i=1;i<=k;i++) {
	    	l.add(sc.nextLong());
	    }
	    
        for(int i=k+1;i<=n;i++) {
	    	long tmp=sc.nextLong();
	    	if(l.poll()<tmp) System.out.println("Yes");
	    	else  System.out.println("No");
	    	l.add(tmp);
	    }
	    
	

	    
	}
}
