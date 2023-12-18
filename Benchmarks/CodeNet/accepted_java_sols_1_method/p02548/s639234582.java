import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		n=n-1;
		int answer=0;
		for(int i=1;i<n+1;i++){
			
			answer+=n/i;
			
	    }
		System.out.println(answer);
	}
	
	
}