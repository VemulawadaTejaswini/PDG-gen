import java.util.*;
public class Main{
    public static void main(String[] args){
		Scanner s=new Scanner(System.in);
    	while(true){
    		int N=s.nextInt();
    		int W=s.nextInt();
    		if(N==0&&W==0)break;
    		for(int i=0;i<N;i++){
        		String S = "";
        		if(i==0)for(int k=0;k<W;k++)S=S+'#';
        		else if(i==N-1)for(int k=0;k<W;k++)S=S+'#';
    			else {
    				S=S+'#';
    				for(int k=1;k<W-1;k++)S=S+'.';	
    				S=S+'#';
    			}
    			System.out.println(S);
    		}
    		System.out.println();    		
    	}
    }
}
//by TTTMongolia 11/05/2012