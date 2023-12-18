
import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] N = new int[6];
			for(int i=0;i<6;i++)N[i]=Integer.parseInt(sc.next());
		//String order = sc.next();
		//char[] charOrder = order.toCharArray();
		Dice dice = new Dice(N);
		
		int q = Integer.parseInt(sc.next());
		
		for(int i=0;i<q;i++){
			int N1 = Integer.parseInt(sc.next());
			int N2 = Integer.parseInt(sc.next());
			int roll=0;int front=0;
			for (int j=0;j<6;j++)if(N[j]==N1)roll=j;
			for (int j=0;j<6;j++)if(N[j]==N2)front=j;
			int answer=dice.getRightRoll(roll,front);
			System.out.println(answer);
		}
		
		sc.close();
	}

}

class Dice{
	private int[] roll=new int[6];
	private int[] nowRoll= new int[6];
	Dice(int[] N){
		for(int i = 0;i<6;i++){
			this.roll[i]=N[i];
			this.nowRoll[i]=N[i];
		}
	}

	public int getNow(){
		return nowRoll[0];
	}

	public void roll(char c){
		//int dir;
		int[] tmpRoll=new int[6];
		for(int i=0;i<6;i++)tmpRoll[i]=this.nowRoll[i];
		int[][] mapRoll={{3,1,0,5,4,2},{1,5,2,3,0,4},{4,0,2,3,5,1},{2,1,5,0,4,3}};
		int dir=0;
		if(c=='E') dir=0;
		if(c=='N') dir=1;
		if(c=='S') dir=2;
		if(c=='W') dir=3;
		for(int i=0;i<6;i++)this.nowRoll[i]=tmpRoll[mapRoll[dir][i]];
	}
	public int getRightRoll(int roll,int front){
		int[][] a={{-1,2,4,1,3,-1},{3,-1,0,5,-1,2},{1,5,-1,-1,0,4},{4,0,-1,-1,5,1},{2,-1,5,0,-1,3},{-1,3,1,4,2,-1}};
		int r=a[roll][front];
		return this.nowRoll[r];
	}
}