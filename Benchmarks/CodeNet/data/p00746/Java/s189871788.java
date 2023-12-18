
import java.util.*;

import static java.lang.System.*;

class Main {
    public static Scanner sc = new Scanner(in);
    public static Random rand=new Random();

    static class P{
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

    int[][] dr=new int[][]{{-1,0},{0,-1},{1,0},{0,1}};
    public void run() {
        Test:while(true){

        	int mx=0,my=0,Mx=0,My=0;
        	int N=sc.nextInt();
        	if(N==0)return;
        	P[] data=new P[N];
        	data[0]=new P(0,0);
        	int ind=1;
            for(int i=0;i<N-1;i++){
            	int n=sc.nextInt(),d=sc.nextInt();
            	data[ind]=new P(data[n].x+dr[d][0],data[n].y+dr[d][1]);
            	mx=Math.min(data[ind].x,mx);
            	Mx=Math.max(data[ind].x,Mx);

            	my=Math.min(data[ind].y,my);
            	My=Math.max(data[ind].y,My);
            	ind++;
            }

            ln((Mx-mx+1)+" "+(My-my+1));
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