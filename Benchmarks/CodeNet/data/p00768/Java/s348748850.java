import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);
    ArrayList<Data> data;
    boolean debug = false;
    
    //global hensuu except for templete

    //method except for templete

    void run(){
	input();
	for(int i=0;i<data.size();i++){
	    if(debug){
		System.out.println("-----------");
		data.get(i).print_M();
		data.get(i).print_T();
		data.get(i).print_P();
		data.get(i).print_R();
		data.get(i).print_m();
		data.get(i).print_t();
		data.get(i).print_p();
		data.get(i).print_j();
		
	    }
	    solve(i);
	    data.get(i).print_ans();
	}
    }
    void solve(int dataset){
	Data d = data.get(dataset);
	int M = d.M, T = d.T, P = d.P, R = d.R;
	int[] m = d.m, t = d.t, p = d.p, j = d.j;

	int[][] solve = new int[T][2];
	int[][] penalty = new int[T][P];
	for(int i=0; i<R; i++){
	    if(j[i]==0){
		solve[t[i]][0]++;
		solve[t[i]][1] += penalty[t[i]][p[i]] * 20 + m[i];
	    }else{
		penalty[t[i]][p[i]]++;
	    }
	}
	/*
	for(int i=0; i<T; i++){
	    System.out.println(Arrays.toString(solve[i]));
	}
	*/

	boolean[] checked = new boolean[T];
	String ans = "";
	int before = -1;
	for(int i=0; i<T; i++){
	    int max = -1;
	    for(int k=0; k<T; k++){
		if(checked[k]) continue;
		if(max==-1 || solve[max][0] < solve[k][0]){
		    max = k;
		}else if(solve[max][0] == solve[k][0]){
		    if(solve[max][1]>=solve[k][1]) max = k;
		}
	    }

	    if(i==0) ans += (max+1);
	    else{
		if(solve[max][0] == solve[before][0]
		   && solve[max][1] == solve[before][1]){
		    ans += "=" + (max+1);
		}else{
		    ans += "," + (max+1);
		}
	    }
	    checked[max] = true;
	    before = max;
	}

	data.get(dataset).set_ans(ans);
    }

    void input(){
	data=new ArrayList<Data>();
	while(true){
	    int M = sc.nextInt(); int T = sc.nextInt();
	    int P = sc.nextInt(); int R = sc.nextInt();
	    if(M==0 && T==0 && P==0 && R==0) break;
	    int[] m = new int[R];
	    int[] t = new int[R];
	    int[] p = new int[R];
	    int[] j = new int[R];
	    for(int i=0; i<R; i++){
		m[i] = sc.nextInt();
		t[i] = sc.nextInt()-1;
		p[i] = sc.nextInt()-1;
		j[i] = sc.nextInt();
	    }
	    data.add(new Data(M, T, P, R, m, t, p, j));
	}
    }
}

class Data{
    int M;
    int T;
    int P;
    int R;
    int[] m;
    int[] t;
    int[] p;
    int[] j;
    String ans;
    
    Data(int M,int T,int P,int R,int[] m,int[] t,int[] p,int[] j){
	this.M=M;
	this.T=T;
	this.P=P;
	this.R=R;
	this.m=m;
	this.t=t;
	this.p=p;
	this.j=j;
	 }
  
    void set_ans(String a){ans=a;}
    
    void print_M(){System.out.println("M= "+M);}
    void print_T(){System.out.println("T= "+T);}
    void print_P(){System.out.println("P= "+P);}
    void print_R(){System.out.println("R= "+R);}
    void print_m(){System.out.println("m[]= "+Arrays.toString(m));}
    void print_t(){System.out.println("t[]= "+Arrays.toString(t));}
    void print_p(){System.out.println("p[]= "+Arrays.toString(p));}
    void print_j(){System.out.println("j[]= "+Arrays.toString(j));}
    void print_ans(){System.out.println(ans);}
}