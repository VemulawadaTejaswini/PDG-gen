import java.util.*;
import java.lang.Math;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	while(true){
	    int N=sc.nextInt();
	    if(N==0) break;
	    
	    int ave =0;
	    int max=0,min=1001;

	    for(int i=0;i<N;i++){
		int t= sc.nextInt();
		if(t<min) min=t;
		if(t>max) max=t;
		ave+=t;
	    }
	    ave= ave-(min+max);

	    System.out.println(ave/(N-2));
	}
    }

}