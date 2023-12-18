import java.util.*;

class Main{
    int T;
    int[] number;
    ArrayList<Integer> r,g,b;

    void solve(){
	Scanner sc = new Scanner(System.in);
	T = sc.nextInt();
	while(T-->0){
	    number = new int[9];
	    for(int i=0; i<9; i++)number[i] = sc.nextInt();
	    r = new ArrayList<Integer>();
	    g = new ArrayList<Integer>();
	    b = new ArrayList<Integer>();
	    for(int i=0; i<9; i++){
		char c = sc.next().charAt(0);
		if(c=='R')r.add(number[i]);
		if(c=='G')g.add(number[i]);
		if(c=='B')b.add(number[i]);
	    }

	    int ans = 1;
	    if(r.size()%3!=0 || g.size()%3!=0 || b.size()%3!=0){
		ans = 0;
	    }else{
		int[] R = new int[r.size()];
		int[] G = new int[g.size()];
		int[] B = new int[b.size()];
		for(int i=0; i<r.size(); i++)R[i] = r.get(i);
		for(int i=0; i<g.size(); i++)G[i] = g.get(i);
		for(int i=0; i<b.size(); i++)B[i] = b.get(i);
		Arrays.sort(R);
		Arrays.sort(G);
		Arrays.sort(B);
		if(r.size()>0){
		    for(int i=0; i<r.size(); i+=3){
			if(R[i]==R[i+1] && R[i+1]==R[i+2])continue;
			if(R[i+1]-R[i]==1 && R[i+2]-R[i+1]==1)continue;
			ans = 0;
		    }
		}
		if(g.size()>0){
		    for(int i=0; i<g.size(); i+=3){
			if(G[i]==G[i+1] && G[i+1]==G[i+2])continue;
			if(G[i+1]-G[i]==1 && G[i+2]-G[i+1]==1)continue;
			ans = 0;
		    }
		}
		if(b.size()>0){
		    for(int i=0; i<b.size(); i+=3){
			if(B[i]==B[i+1] && B[i+1]==B[i+2])continue;
			if(B[i+1]-B[i]==1 && B[i+2]-B[i+1]==1)continue;
			ans = 0;
		    }
		}
	    }
	    System.out.println(ans);
	}
    }

    public static void main(String[] args){
	new Main().solve();
    }
}