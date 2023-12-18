import java.util.*;

class Main{

    char[] in;
    int p;

    void solve(){
	Scanner sc = new Scanner(System.in);

	while(true){
	    String line = sc.next();
	    if(line.equals(".")) break;
	    
	    in = new char[line.length()];
	    p = 0;
	    
	    int cnt = 0;
	    for(int P=0; P<=2; P++){
		for(int Q=0; Q<=2; Q++){
		    for(int R=0; R<=2; R++){
			
			for(int i=0; i<line.length(); i++){
			    in[i] = line.charAt(i);
			    if(in[i]=='P') in[i] = (char)(P+'0');
			    if(in[i]=='Q') in[i] = (char)(Q+'0');
			    if(in[i]=='R') in[i] = (char)(R+'0');
			}
			p = 0;
			int ans = formula();
			//System.out.println(Arrays.toString(in)+" "+ans);
			if(ans==2) cnt++;
			
		    }
		}
	    }
	    
	    System.out.println(cnt);
	}
    }

    int formula(){
	int res = 0;
	if(p<in.length && Character.isDigit(in[p])){
	    res = in[p] - '0';
	    p++;
	}else if(p<in.length && in[p]=='-'){
	    p++;
	    res = mai(formula());
	    //p++;
	}else if(p<in.length && in[p]=='('){
	    p++;
	    int a = formula();
	    //p++;
	    boolean boo = false;
	    if(in[p]=='+') boo = true;
	    p++;
	    int b = formula();
	    //System.out.println(a+" "+b);
	    p++;
	    if(boo) res = plus(a, b);
	    else res = mul(a, b);
	}
	return res;
    }

    int[] c1 = {2,1,0};
    int[][] c2 = {{0,0,0},{0,1,1},{0,1,2}};
    int[][] c3 = {{0,1,2},{1,1,2},{2,2,2}};
    int mai(int x){ return c1[x]; }
    int mul(int x, int y){ return c2[x][y]; }
    int plus(int x, int y){ return c3[x][y]; }

    public static void main(String[] args){
	new Main().solve();
    }
}

	       