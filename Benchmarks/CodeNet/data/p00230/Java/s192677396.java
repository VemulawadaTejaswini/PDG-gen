import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class data
{
	int floor;
	int number;
	int times;
	data(){return;}
	data(int floor,int number,int times)
	{
		this.floor=floor;
		this.number=number;
		this.times=times;
	}
}

public class Main {

	/**
	 * @param args
	 */
	/**
	 * @param building
	 * @param n
	 * @return
	 */
	int solve(int[][] building,int n)
	{
		Queue<data> que=new LinkedList<data>();
		que.add(new data(0,0,0));
		que.add(new data(0,1,0));
		
		Boolean[][] visited=new Boolean[n+2][2];
		for(int i=0;i<n+2;++i){for(int j=0;j<2;++j){visited[i][j]=false;}}
		
		while(!que.isEmpty())
		{
			data present=que.poll();
			System.out.println(present.floor+" "+present.number+" "+present.times);
			
			if(visited[present.floor][present.number])continue;
			visited[present.floor][present.number]=true;

			int floor=present.floor;
			int num=present.number==1?0:1;
			switch(building[present.floor][present.number])
			{
			case 1:
				int i;
				for(i=present.floor;building[i][present.number]==1;++i);
				--i;
				floor=i;
				break;
			case 2:
				for(i=present.floor;building[i][present.number]==2;--i);
				floor=i;
				break;
			}
			if(floor>=n-1)return  present.times;
			for(int i=0;i<3;++i)
			{
				que.add(new data(floor,num,present.times+1));
				++floor;
			}
		}
		return -1;
	}
	
	void io()
	{
		Scanner s=new Scanner(System.in);
		int n;
		int building[][];
		while((n=s.nextInt())>0)
		{
			building=new int[n][2];
			for(int i=0;i<n;++i)
			{
				building[i][0]=s.nextInt();
			}
			for(int i=0;i<n;++i)
			{
				building[i][1]=s.nextInt();
			}
			int ans=solve(building,n);
			if(ans==-1){System.out.println("NA");}
			else{System.out.println(ans);}
		}
		s.close();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().io();
	}

}