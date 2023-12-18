import java.util.*;

class Main{

    char[] in;

    void solve(){
	Scanner sc = new Scanner(System.in);

	int dataset = sc.nextInt();
	while(dataset-->0){
	    in = sc.next().toCharArray();
	    System.out.println(expr(0, in.length-1));
	}
    }

    int expr(int l, int r){
	int depth = 0;
	for(int i=l; i<r; i++){
	    if(in[i]=='(') depth++;
	    else if(in[i]==')') depth--;

	    if(depth!=0) continue;
	    if(in[i]=='+'){
		int nn = expr(l, i) + expr(i+1, r);
		return nn;
	    }else if(in[i]=='-'){
		int nn = expr(l, i) - expr(i+1, r);
		return nn;
	    }
	}

	int res = 0;
	int enzan = 2; // 0:+ , 1:- , 2:nothing
	int left = -1, right = -1;
	for(int i=l; i<r; i++){
	    if(in[i]=='('){
		depth++;
		if(left==-1){
		    left = i;
		    right = i;
		}
	    }else if(in[i]==')'){
		depth--;
		if(depth==0){
		    if(enzan==0){
			res *= expr(left+1, i);
		    }
		    if(enzan==1) res /= expr(left+1, i);
		    if(enzan==2) res = expr(left+1, i);
		    left = right = -1;
		}
	    }else if(depth==0 && Character.isDigit(in[i])){
		if(enzan==0) res *= digit(i);
		if(enzan==1) res /= digit(i);
		if(enzan==2) res = digit(i);
		while(i+1<in.length-1 && Character.isDigit(in[i+1])){
		    i++;
		}
	    }else if(depth==0 && in[i]=='*' || in[i]=='/'){
		if(in[i]=='*') enzan = 0;
		else enzan = 1;
	    }
	}

	return res;
    }

    int digit(int p){
	int res = 0, l = p;
	while(p<in.length-1 && Character.isDigit(in[p])) p++;
	for(int i=l; i<p; i++)
	    res += (in[i]-'0') * (int)Math.pow(10, p-i-1);
	return res;
    }

    public static void main(String[] args){
	new Main().solve();
    }
}