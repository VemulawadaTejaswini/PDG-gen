
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class Main {
public static void main(String[] args) throws IOException{

	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	int[][] mat=new int[10][10];
	for(int i=0;i<10;i++)
		for(int j=0;j<10;j++) {
			mat[i][j]=0;
		}
	String str="";
	str=in.readLine();
	StringTokenizer s=new StringTokenizer(str);
	
	while(s.hasMoreTokens()) {
		String next=s.nextToken(",");
		int x=Integer.parseInt(next);
		int y=Integer.parseInt(s.nextToken(","));
		int size=Integer.parseInt(s.nextToken(","));
		if(size==1) {
			for(int i=x-1;i<=x+1 && i>=0  && i <10 ;i++)
				mat[i][y]+=1;
			for(int i=y-1;i<=y+1 && i>=0  && i <10 ;i++)
				mat[x][i]+=1;
		}
		if(size>=2) {
			for(int i=x-1;i<=x+1;i++) 
				for(int j=y-1;j<=y+1;j++) {
					if(i<10 && i>=0 && j<10 && j>=0)
						mat[i][j]+=1;
				}
		}
		if(size==3) {
			if((x-2)>=0)
				mat[x-2][y]+=1;
			if((x+2)<10)
				mat[x+2][y]+=1;
			if((y-2)>=0)
				mat[x][y-2]+=1;
			if((y+2)<10)
				mat[x][y+2]+=1;
		}
		str=in.readLine();
		s=new StringTokenizer(str);	
		
	}
	int num_zero=0;
	int max=Integer.MIN_VALUE;
	for(int i=0;i<10;i++)
		for(int j=0;j<10;j++) {
			if(mat[i][j]==0)
				num_zero++;
			if(mat[i][j]>max)
				max=mat[i][j];
		}
	
	System.out.println(num_zero);
	System.out.print(max);
}

}