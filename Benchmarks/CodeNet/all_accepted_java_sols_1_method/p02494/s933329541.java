import java.util.*;
public class Main{
    public static void main(String[] args){
		Scanner s=new Scanner(System.in);
    	while(true){
    		String S = "";
    		int N=s.nextInt();
    		int W=s.nextInt();
    		if(N==0&&W==0)break;
    		for(int i=0;i<W;i++)S=S+'#';
    		for(int i=0;i<N;i++)System.out.println(S);
    		System.out.println();    		
    	}
    }
}
//by TTTMongolia 11/05/2012