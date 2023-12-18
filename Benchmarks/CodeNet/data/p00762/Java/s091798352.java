import java.util.*;
public class Main {
    Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        new Main();
    }
    public Main() {
    	new AOJ1181().doIt();
    }
    
    class AOJ1181{
    	int n;
    	int[] cnt;
    	int[][] height;
    	int[][] map;
		int[] sx = {0,1,0,-1,0};
		int[] sy = {-1,0,1,0,0};
		ArrayList<Integer> list;
    	
    	int nextMuki(Dice d,ArrayList<Integer> list){
    		int[] a = {-1,-1,-1,-1};
    		if(!list.contains(0))a[0] = d.getNorth();
    		if(!list.contains(1))a[1] = d.getEast();
    		if(!list.contains(2))a[2] = d.getSourth();
    		if(!list.contains(3))a[3] = d.getWest();
    		int maxIndex = 0;
    		for(int i=0;i<4;i++)if(a[maxIndex] < a[i])maxIndex = i;
//    		System.out.println(Arrays.toString(a));
    		if(a[maxIndex]==4||a[maxIndex]==5||a[maxIndex]==6)return maxIndex;
    		return 4;
    	}
    	
    	void dfs(int x,int y,Dice d){
    		list = new ArrayList<Integer>();
    		int nmuki = 4;
			for(int s=0;s<3;s++){
				nmuki = nextMuki(d,list);
				if(nmuki==-1)break;
				int nx = sx[nmuki]+x;
				int ny = sy[nmuki]+y;
				if(height[y][x] > height[ny][nx])break;
				list.add(nmuki);
				nmuki = 4;
			}
			int nx = sx[nmuki]+x;
			int ny = sy[nmuki]+y;
			if(nmuki==4){
				map[ny][nx]=d.top;
				height[ny][nx]++;
				return;
			}else{
				switch (nmuki) {
				case 0:
					d.rotateNorth();break;
				case 1:
					d.rotateEast();break;
				case 2:
					d.rotateSouth();break;
				case 3:
					d.rotateWest();break;
				}
				dfs(nx,ny,d);
			}
    	}
    	
    	void solve(){
    		height = new int[100][100];
    		map = new int[100][100];
    		for(int i=0;i<n;i++){
    			int x = 50,y = 50;
    			Dice d = new Dice(in.nextInt(), in.nextInt());
    			dfs(x, y, d);
    		}
    		for(int i=0;i<100;i++)for(int s=0;s<100;s++)if(map[i][s]!=0)cnt[map[i][s]]++;
    	}
    	
    	void doIt(){
    		while(in.hasNext()){
    			 n = in.nextInt();
    			 if(n==0)break;
    			 cnt = new int[7];
    			 solve();
    			 for(int i=1;i<6;i++)System.out.print(cnt[i]+" ");
    			 System.out.println(cnt[6]);
    		}
    	}
    }
    

	//サイコロライブラリ
	class Dice{ 
		private int top=1,bottom=6,east=5,west=2,north=4,south=3;
		public Dice(int t,int s) {
			switch(t){
			case 1: break;
			case 2: rotateEast(); break;
			case 3: rotateNorth(); break;
			case 4: rotateSouth(); break;
			case 5: rotateWest(); break;
			case 6: reverse(); break;
			}
			while(s!=south) rotateCW();
		}
		boolean IsDice(){
			return north+south==7&&top+bottom==7&&west+east==7;
		}
		Dice rotateEast(){
			int temp=east;east=top;top=west;west=bottom;bottom=temp;
			return this;
		}
		Dice rotateWest(){
			int tmp=west; west=top; top=east; east=bottom; bottom=tmp;
			return this;
		}
		Dice rotateSouth(){
			int tmp=south; south=top; top=north; north=bottom; bottom=tmp;
			return this;
		}
		Dice rotateNorth(){
			int tmp=north; north=top; top=south; south=bottom; bottom=tmp;
			return this;
		}
		Dice reverse(){
			rotateNorth(); rotateNorth(); rotateCW(); rotateCW();
			return this;
		}
		Dice rotateCW(){
			int tmp=north; north=west; west=south; south=east; east=tmp;
			return this;
		}
		Dice rotateCCW(){
			int tmp=north; north=east; east=south; south=west; west=tmp;
			return this;
		}
		int getTop(){
			return top;
		}
		int getBottom(){
			return bottom;
		}
		int getEast(){
			return east;
		}
		int getWest(){
			return west;
		}
		int getSourth(){
			return south;
		}
		int getNorth(){
			return north;
		}
		@Override public String toString(){
			return "top"+top+" north"+north+" east"+east+" south"+south+" west"+west+" bottom"+bottom;
		}
		@Override public boolean equals(Object obj){
			if(obj==this)return true;
			if(!(obj instanceof Dice))return false;
			Dice d = (Dice)obj;
			if(this.top==d.getTop()&&this.bottom==d.getBottom()&&
					this.east==d.getWest()&&this.west==d.getWest()&&
					this.north==d.getNorth()&&this.south==d.getSourth())return true;
			return false;
		}
	}
    
}