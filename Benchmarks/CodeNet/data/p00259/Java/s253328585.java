import java.util.*;

class Main{

    int INF=1<<28;
    boolean debug=false;

    char[] in;
    int pp; // prime
    int p; // in[p]

    void solve(){
	Scanner sc = new Scanner(System.in);

	while(true){
	    String[] line = sc.nextLine().split(":");
	    if(line[0].equals("0")) break;

	    pp = Integer.parseInt(line[0]);

	    int cnt = 0;
	    for(int i=0; i<line[1].length(); i++){
		if(line[1].charAt(i)!=' ') cnt++;
	    }

	    in = new char[cnt];
	    p = 0;
	    int idx = 0;
	    for(int i=0; i<line[1].length(); i++){
		if(line[1].charAt(i)!=' ') in[idx++] = line[1].charAt(i);
	    }

	    int ans = expr();
	    if(ans==INF) System.out.println("NG");
	    else{
		String s = "";
		for(int i=0; i<in.length; i++){
		    s += in[i];
		}
		s += " = " + ans + " (mod "+pp+")";
		System.out.println(s);
	    }
	}
    }

    int expr(){
	int a = term();
	if(a==INF) return INF;
	while(true){
	    if(p>=in.length || (in[p]!='+' && in[p]!='-')) break;
	    boolean add = in[p++] == '+';

	    int b = term();
	    if(b==INF) return INF;
	    if(add){
		//int aa = a;
		a = calc(a, b, '+');
		//System.out.println(aa+" + "+b+" = "+a);
	    }else{
		//int aa = a;
		a = calc(a, b, '-');
		//System.out.println(aa+" + "+b+" = "+a);
	    }
	}
	return a;
    }

    int term(){
	int a = factor();
	while(true){
	    if(p>=in.length || (in[p]!='*' && in[p]!='/')) break;
	    boolean mul = in[p++] == '*';

	    int b = factor();
	    if(b==INF) return INF;
	    if(mul) a = calc(a, b, '*');
	    else{
		if(b==0) return INF;
		else a = calc(a, b, '/');
	    }
	}
	return a;
    }

    int factor(){
	if(p<in.length && in[p]=='('){
	    p++;
	    int res = expr();
	    p++;
	    return res;
	}else return digit();
    }

    int digit(){
	int res = 0;
	while(p<in.length && Character.isDigit(in[p])) res = res * 10 + in[p++] - '0';
	return res;
    }

   int calc(int a,int b,char op){
       //if(debug)System.out.printf("a=%d b=%d op=%s pp=%d p=%d\n",a,b,op,pp,p);
	if(b==0){return INF;}

	while(a<0)a+=pp;
	while(b<0)b+=pp;
	a%=pp;b%=pp;
	
	int val=-1;
	switch(op){
	case '+':{val=(a+b)%pp;break;}
	case '-':{val=(a-b)%pp;break;}
	case '*':{val=(a*b)%pp;break;}
	case '/':{
	    int d=-1;
	    for(int i=0;i<pp;i++){
		if((i*b)%pp==1){d=i;break;}
	    }
	    val=(a*d)%pp;
	}
	}

	while(val<0)val+=pp;
	//	if(debug)System.out.printf("val=%d\n",val);
	return val;
    }


    public static void main(String[] args){
	//System.out.println(calc(13,8,'+',17));
	new Main().solve();
	//System.out.println(calc(3,7+19*3,'*',19));
    }
}