import java.util.*;
public class Main{
    public static void main(String[] args){
		Scanner s=new Scanner(System.in);
    	while(true){
    		int N=s.nextInt();
    		int W=s.nextInt();
    		if(N==0&&W==0)break;
    		for(int i=0;i<N;i++){
        		for(int k=0;k<W;k++){
        			if((i+k)%2==1)System.out.printf(".");
        			if((i+k)%2==0)System.out.printf("#");
               	}
        		System.out.println();
    		}
    		System.out.println();
    	}
    }
}
//by TTTMongolia 11/05/2012