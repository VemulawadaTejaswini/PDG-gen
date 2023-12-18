import java.util.*;
public class Main {
	static int r;
	static int c;
    public static void main(String[] args) throws java.io.IOException{
        Scanner scan = new Scanner(System.in);
      
        while(true){
        	 r = scan.nextInt();
        	 c = scan.nextInt();
        	if((r|c)==0)break;
        	int [][] os=new int[r][c];
        	
        	for(int i=0;i<r;i++)
        		for(int j=0;j<c;j++)
        			os[i][j]=scan.nextInt();
        	int max=0;
        	for(int i=0;i<Math.pow(2,r);i++){
        		int [] flip =new int[10];
        		for(int j=0;j<r;j++)
        			if((i>>j&1)==1)flip[j]=1;
        		int ans=0;
        		for(int j=0;j<c;j++){
        			int surf=0;
        			for(int k=0;k<r;k++)
        				if((os[k][j] ^ flip[k]) == 1)surf++;
        				if(surf<r - surf)
        					ans+=r - surf;
        				else ans+=surf;
        		
        		max = Math.max(ans,max);
        		}
        	}
        	System.out.println(max);
        }
    }
}