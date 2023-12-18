import java.util.*;
import java.lang.*;
import java.io.*;
import java.awt.Point;

class Main{

    private static int[][] used;
    private static int N,M,L;
    private static List<Pox>[] list;
    private static final int INF = 100000000;

    private static class Pox{
	public int B,D,E;
	Pox(){
	    B = D = E = 0;
	}

	Pox(int b,int d,int e){
	    B = b;
	    D = d;
	    E = e;
	}
    }

    private static class Eleac implements Comparable<Eleac>{
	public int id,L,num;

	Eleac(){
	    id = L = num = 0;
	}

	Eleac(int a,int b,int c){
	    id = a;
	    L = b;
	    num = c;
	}

	@Override
	public int compareTo(Eleac a){
	    return 1;
	}

    }

     @SuppressWarnings("unchecked")
      public static void main(String args[])throws IOException{
	  BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	  //PrintWriter out = new PrintWriter(System.out);
	  
	  while(true)
	      {
		  String[] elements = in.readLine().split(" ");
		  N = Integer.parseInt(elements[0]);
		  M = Integer.parseInt(elements[1]);
		  L = Integer.parseInt(elements[2]);
		  if(N == 0 && M == 0 && L == 0)
		      break;

		  

		  used = new int[N+1][L+1];
		  list = new ArrayList[N+2];

		  for(int i=0;i<N+1;i++)
		      for(int j=0;j<L+1;j++)
			  used[i][j] = INF;

		  for(int i=0;i<N+1;i++)
		      list[i] = new ArrayList<Pox>();
		  
		  for(int i=0;i<M;i++)
		      {
			 elements = in.readLine().split(" ");
			 int A,B,D,E;
			  A = Integer.parseInt(elements[0]);
			  B = Integer.parseInt(elements[1]);
			  D = Integer.parseInt(elements[2]);
			  E = Integer.parseInt(elements[3]);
			  //System.out.println("A : " + A  + " B : " + B + " D : " + D + " E : " + E);
			  list[A].add(new Pox(B,D,E));  
			  list[B].add(new Pox(A,D,E));
		      }

		  Queue<Eleac> que = new PriorityQueue<Eleac>();

		  que.offer(new Eleac(1,L,0)); //Eleac(id,money,the number of eemy)
		  used[1][L] = 0;		

		  int men = INF;
		  while(que.size() > 0)
		      {
			  Eleac p = que.poll(); 
			  int now = p.id;
			  int money = p.L;
			  int val = p.num;
			  // System.out.println("poll : now -> " + now + " money -> " + money + " val -> " + val );
			  if(now == N)
			      {
				  used[now][money] = Math.min(used[now][money],val);	
				  continue;
			      }
		      
			 
			  for(int i=0;i<list[now].size();i++)
			      {
				  int need = list[now].get(i).D;

				  int new_pos = list[now].get(i).B;
				  int the_number = list[now].get(i).E;
				  
				  if(money-need >= 0 && used[new_pos][money-need] > val)
				      {
					  used[new_pos][money-need] = val;
					  que.add(new Eleac(new_pos,money-need,val));
				      }				  	
				  if(used[new_pos][money] > val+the_number)
				      {
					  used[new_pos][money] = val+the_number;
					  que.add(new Eleac(new_pos,money,val+the_number));
				      }

			      }

		      
		      }

		  for(int i=0;i<=L;i++)
		      {
			  men = Math.min(men,used[N][i]);
		      }
		  System.out.println(men);
	      }
      }

}