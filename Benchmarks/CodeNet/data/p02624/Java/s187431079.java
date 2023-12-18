import java.util.*;
public class Main{
    public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	int N=sc.nextInt();
	int g[]= new int[N+1];
	long ans =0;
	
	for(int j=1; j<N+1; j++){
	    for(int i=j; i<N+1; i++){
		if(i%j==0){
		    g[j]=g[j]+i;
		}
	    }
	    //System.out.println(ans);
	    ans = ans+g[j];
	}
	
	System.out.println(ans);
	
    }
}

