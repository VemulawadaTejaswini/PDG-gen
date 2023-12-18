import java.util.*;

class Main{

    char[] in;
    int p;

    void solve(){
	Scanner sc = new Scanner(System.in);

	int dataset = sc.nextInt();
	while(dataset-->0){
	    in = sc.next().toCharArray();
	    p = 0;
	    System.out.println(expr());
	}
    }

    int expr(){
	int a = term();
	while(in[p]=='+' || in[p]=='-'){
	    int enzan = 0;
	    if(in[p]=='-') enzan = 1;
	    p++;
	    int b = term();
	    if(enzan==0) a += b;
	    else a -= b;
	} 
	return a;
    }

    int term(){
	int a = factor();
	while(in[p]=='*' || in[p]=='/'){
	    int enzan = 0;
	    if(in[p]=='/') enzan = 1;
	    p++;
	    int b = factor();
	    if(enzan==0) a *= b;
	    else a /= b;
	} 
	return a;
    }

    int factor(){
	if(in[p]=='('){
	    p++;
	    int res = expr();
	    p++;
	    return res;
	}
	return digit();
    }

    int digit(){
	int res = 0;
	while(p<in.length-1 && Character.isDigit(in[p])){
	    res = res * 10 + (in[p]-'0');
	    p++;
	}
	return res;
    }

    public static void main(String[] args){
	new Main().solve();
    }
}