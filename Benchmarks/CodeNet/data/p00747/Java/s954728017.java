
import java.util.*;

import static java.lang.System.*;

class Main {
    public static Scanner sc = new Scanner(in);
    public static Random rand=new Random();

    static  class P{
    	int x;
    	int y;
    	public P(int x,int y){
    		this.x=x;this.y=y;
    	}

    	@Override
    	public boolean equals(Object obj) {
    		if(!(obj instanceof P))return false;
    		P p=(P)obj;
    		return p.x==x && p.y==y;
    	}
    	@Override
    	public String toString() {
    		return "("+x+","+y+")";
    	}
    }

    public void run() {
        Test:while(true){
        	int W=sc.nextInt();
        	int H=sc.nextInt();
        	if(W==0 && H==0)return;
        	boolean[][] map=new boolean[H][W];

        	int[][] wall=new int[2*H-1][W];
        	for(int h=0;h<2*H-1;h++){
        		for(int w=0;w<(h%2==0?(W-1):W);w++){
            		wall[h][w]=sc.nextInt();
        		}
        	}

        	Queue<P> plist=new LinkedList<P>();
        	plist.add(new P(0,0));
        	map[0][0]=true;
        	int l=1;
        	while(!plist.isEmpty()){
        		Queue<P> next=new LinkedList<P>();

        		while(!plist.isEmpty()){
	        		P p=plist.poll();
	        		if(p.x ==W-1 &&p.y ==H-1){
	        			ln(l);continue Test;
	        		}
	        		//N
	        		if(p.y-1>=0){
		        		if(wall[2*p.y-1][p.x]==0 && !map[p.y-1][p.x]){
		        			map[p.y-1][p.x]=true;
		        			next.add(new P(p.x,p.y-1));
		        		}
	        		}
	        		//S
	        		if(p.y+1<H){
		        		if(wall[2*p.y+1][p.x]==0 && !map[p.y+1][p.x]){
		        			map[p.y+1][p.x]=true;
		        			next.add(new P(p.x,p.y+1));
		        		}
	        		}
	        		//E
	        		if(p.x+1<W){
		        		if(wall[2*p.y][p.x]==0 && !map[p.y][p.x+1]){
		        			map[p.y][p.x+1]=true;
		        			next.add(new P(p.x+1,p.y));
		        		}
	        		}
	        		//W
	        		if(p.x-1>=0){
		        		if(wall[2*p.y][p.x-1]==0 && !map[p.y][p.x-1]){
		        			map[p.y][p.x-1]=true;
		        			next.add(new P(p.x-1,p.y));
		        		}
	        		}
        		}
        		l++;
        		plist=next;
        	}
        	ln(0);
        }
    }
    public static void main(String[] args) {
        new Main().run();
    }

    public int[] nextIntArray(int n){
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            res[i]=sc.nextInt();
        }
        return res;
    }
    public static void pr(Object o) {
        out.print(o);
    }
    public static void ln(Object o) {
        out.println(o);
    }
    public static void ln() {
        out.println();
    }
}