import java.util.*;

public class Main {

	public static void main(String[] args) {
	 Scanner input= new Scanner(System.in);
	  
        int n,k,ans=0;
        n=input.nextInt();
        k=input.nextInt();
        if(n%k!=0)
         ans=n%k;
        System.out.println(ans);
        	
        
	}

}
