
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);
		try{
	           
	
	 	   int n=sc.nextInt();
	 	   int m=sc.nextInt();
	 	   int ch=sc.nextInt()-1;
	 	   int cw=sc.nextInt()-1;
	 	   int dh=sc.nextInt()-1;
	 	   int dw=sc.nextInt()-1;
	 char a[][]=new char[n][m];
	 for(int i=0;i<n;i++) {
		 char c[]=sc.next().toCharArray();
		 for(int j=0;j<m;j++) {
			 a[i][j]=c[j];
		 }
	 }
	 int dis[][]=new int[n][m];
	 for(int i=0;i<n;i++) {
		Arrays.fill(dis[i],Integer.MAX_VALUE);
	 }
	 Deque<Integer> dq=new LinkedList<>();
	 int dirx[]= {-1,1,0,0};
	 int diry[]= {0,0,-1,1};
	 dis[ch][cw]=0;
	 dq.addFirst(cw);
	 dq.addFirst(ch);
	 while(!dq.isEmpty()) {
		int newx=dq.pollFirst(),newy=dq.pollFirst();
		for(int i=0;i<4;i++) {
			int currx=newx+dirx[i],curry=newy+diry[i];
			if(isValid(currx,curry,n,m)) {
				if(a[currx][curry]=='.') {
				if(dis[currx][curry]>dis[newx][newy]) {
					dis[currx][curry]=dis[newx][newy];
					dq.addFirst(curry);
					dq.addFirst(currx);
				}
				}
			}
		}
		for(int i=newx-2;i<=newx+2;i++) {
			for(int j=newy-2;j<=newy+2;j++) {
				
				if(isValid(i,j,n,m)){
					if(a[i][j]=='.') {
						if(dis[i][j]>dis[newx][newy]+1) {
							dis[i][j]=dis[newx][newy]+1;
							dq.addLast(i);
							dq.addLast(j);
						}
					}
				}
				
}
		}
	 }
	 if(dis[dh][dw]!=Integer.MAX_VALUE)
	 System.out.println(dis[dh][dw]);
	 else
		 System.out.println("-1");


		
		}catch(Exception e){
		    return;
		}
		}
	static boolean isValid(int i,int j,int r,int c ) {
			return i>=0&&j>=0&&i<r&&j<c;
	}
	}
