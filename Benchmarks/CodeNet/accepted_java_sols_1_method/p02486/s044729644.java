import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n, x, i, j, k, count;

	while(true){
	    n = sc.nextInt();
	    x = sc.nextInt();
	    if((n|x)==0)
		break;
	    count = 0;
	    for(i=1; i<n; i++)
		for(j=i+1; j<n; j++)
		    for(k=j+1; k<=n; k++)
			if(i+j+k==x)
			    count++;
	    
	    System.out.println(count);
	}
    }
}