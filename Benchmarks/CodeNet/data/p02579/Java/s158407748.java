import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int m=scn.nextInt();
		char [][]arr =new char[n][m];
		int sr =scn.nextInt();
		int sc =scn.nextInt();
		sr--;
		sc--;
		int dr =scn.nextInt();
		int dc=scn.nextInt();
		dr--;
		dc--;
		int cnt=0;
		while(cnt<n){
			String s =scn.next();
			arr[cnt]=s.toCharArray();
			cnt++;
		}
		System.out.println(find(sr,sc,arr,dr,dc));

	}
	// I have 5 choices either go any direction and if any one is block use the power...
	public static long find(int sr ,int sc , char[][]arr ,int dr ,int dc){
		PriorityQueue<pair>pq =new PriorityQueue<>();
		pq.add(new pair(sr,sc,0));
		int [][]arr1 =new int[arr.length][arr[0].length];
		int []r={0,0,1,-1};
		int []c={1,-1,0,0};
		int [][]dir={{-2,-2},{-2,-1},{-2,0},{-2,1},{-2,2},
					{-1,-2},{-1,-1},{-1,0},{-1,1},{-1,2},
					 {0,-2},{0,-1},{0,0},{0,1},{0,2},
					 {1,-2},{1,-1},{1,0},{1,1},{1,2},
					 {2,-2},{2,-1},{2,0},{2,1},{2,2}
					 };
		while(pq.size()>0){
			pair p1 =pq.remove();
			if(p1.r==dr&& p1.c==dc){
				return p1.cost;
			}
			if(arr1[p1.r][p1.c]==1){
				continue;
			}
			arr1[p1.r][p1.c]=1;
			// I have 4 directions choice and a magic choice
			for(int i=0;i<4;i++){
				int nr =p1.r+r[i];
				int nc=p1.c+c[i];
				if(isvalid(nr,nc,arr,arr1)){
					pq.add(new pair(nr,nc,p1.cost));
				}
			  
			}
			// using the power boom......
			for(int i=0;i<dir.length;i++){
			  int nr= dir[i][0]+p1.r;
			  int nc=dir[i][1]+p1.c;
			  if(isvalid(nr,nc,arr,arr1)){
					pq.add(new pair(nr,nc,p1.cost+1));
				}
			}
			 
		}
		
		return -1;
	}
	public static boolean isvalid(int r ,int c, char [][]arr ,int [][]arr1){
		if(r<0 || r>=arr.length ||c>=arr[0].length || c<0 || arr[r][c]=='#' ||arr1[r][c]==1 ){
			return false;
		}
		return true;
	}
	
	public static class pair implements Comparable<pair>{
		int r;
		int c;
		 long cost;
		 public pair(int r ,int c , long cost){
			 this.r=r;
			 this.c=c;
			 this.cost=cost;
			 
		 }
		 public int compareTo(pair o){
			 return (int)(this.cost - o.cost);
		 }
	}

}