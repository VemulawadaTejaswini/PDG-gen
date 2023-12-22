import java.lang.*;
import java.util.*;

public class Main
{
    
    public static void main(String args[])
    {
	int[] num = new int[11];
	int[] a_i = new int[21];
	Scanner sc = new Scanner(System.in);
	int i,j,t;
	
	int in,l,c;

	while(true){
	    in = sc.nextInt();
	    l = sc.nextInt();
	    if(in == 0 && l == 0)break;
	    for(i=0; i<l; i++){
		num[i] = 0;
	    }
	    c=0;
	    
	    while(true){
		 
		if(c==0){
		    a_i[c]=in;
		    c++;
		}else{
		    for(i=0; i<10; i++){
			num[i] = 0;
		    }
		    int max=0, min=0;
		    			
		    for(i=0; i<l; i++){
		
			if(in<0){
			    num[0] += 1;
			}else{
			    num[in%10] += 1;
			    in /= 10;
			}
		    }
		    		     
		    for(t=l, i=9; t>0 ; i--){
			if(num[i] == 0) continue;
			while(num[i] > 0){
			    max += i;
			    if(--t <= 0) break;
			    max *= 10;
			    num[i]--;
			    
			}
		    }
		    
		    in = max;
		    for(t=0; t<l ;t++){
				if(in%10 == 0){
				    in/=10;
				}else{
				    min += in%10;
				    min *= 10;
				    in/=10;
				}			
		    }
		    min/=10;
		    		    
		    boolean f= false;
		    
		    for(i=0;i<c;i++){
			if(a_i[i]==(max - min)){
			    System.out.println( i + " " + a_i[i] + " " + (c-i) );
			    f=true;
			}
			
		    }
		    if(f) break;
		    
		    a_i[c++] = max - min;
		    in = max-min;
		}
		
	    }
	    
	}
    }
}

    