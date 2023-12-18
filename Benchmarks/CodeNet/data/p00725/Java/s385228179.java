import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;

class Main {
    public static Scanner sc = new Scanner(in);
    //public static Random sc=new Random();

    public final int[] dx=new int[]{0,1,0,-1};
    public final int[] dy=new int[]{1,0,-1,0};


    public int dfs(int px,int py,int depth){
    	if(depth>10)return Integer.MAX_VALUE;

    	int mv=Integer.MAX_VALUE;
    	D:for(int d=0;d<4;d++){
    		int nx=px,ny=py;
    		int move=0;
    		while(map[ny][nx]!=1){
    			if(map[ny][nx]==3)
    				return depth;

    			nx+=dx[d];ny+=dy[d];
    			move++;
    			if(!(0<=nx && nx <W) || !(0<= ny && ny <H))
    				continue D;
    		}
    		//衝突した時
    		if(move>=2){
	    		map[ny][nx]=0;
	    		mv=min(mv,dfs(nx-dx[d],ny-dy[d],depth+1));
	    		map[ny][nx]=1;
    		}
    	}
    	return mv;
    }

    int[][] map;
    int W,H;
    public void run() {
    	while(true){
    		W=sc.nextInt();H=sc.nextInt();
    		if(W==0 && H==0)return;

    		map=new int[H][W];

    		for(int h=0;h<H;h++)for(int w=0;w<W;w++){
        			map[h][w]=sc.nextInt();
        	}

    		for(int h=0;h<H;h++)for(int w=0;w<W;w++)
        			if(map[h][w]==2){
        				int res=dfs(w,h,1);
        				ln(res==Integer.MAX_VALUE?-1:res);
        				continue;
        			}
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


	//output lib
	public static void pr(Object... obj){
		out.print(str(obj));
	}
    public static void ln(){
		out.println();
	}
	public static void ln(Object... obj){
		pr(obj);ln();
	}
	public static String str(Object obj){
		return obj.toString();
	}
	public static <E> String str(E[] obj){
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<obj.length;i++){
			sb.append(i==0?"":" ").append(obj[i]);
		}
		return sb.toString();
	}
	public static <E> String str(List<E> obj){
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<obj.size();i++){
			sb.append(i==0?"":" ").append(obj.get(i));
		}
		return sb.toString();
	}
}