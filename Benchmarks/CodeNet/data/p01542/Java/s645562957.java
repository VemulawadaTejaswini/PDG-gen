import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class Main{
	Scanner sc=new Scanner(System.in);

	int INF=1<<28;
	double EPS=1e-12;

	final char[] op={'0', '1', '+', '-', '*', '(', ')'};
	String s;
	char[] cs;
	int max;

	void run(){
		s=sc.nextLine();
		solve();
	}

	void solve(){
		s+="$";
		cs=s.toCharArray();
		max=-1;
		dfs(0);
		println(max+"");
	}

	void dfs(int i){
		if(i==cs.length){
			max=max(max, calc());
			return;
		}
		if(cs[i]=='.'){
			for(char c : op){
				cs[i]=c;
				dfs(i+1);
				cs[i]='.';
			}
		}else{
			dfs(i+1);
		}
	}

	int calc(){
		Result r=E(0);
		r.good&=r.p==cs.length-1;
		if(r.good){
			for(int i=0; i<cs.length; i++){
				if(cs[i]!='('){
					continue;
				}
				int stack=0;
				boolean op=false;
				for(int j=i+1; cs[j]!=')'||stack!=0; j++){
					if(cs[j]=='('){
						stack++;
					}else if(cs[j]==')'){
						stack--;
					}
					if(stack==0){
						op|=cs[j]=='+'||cs[j]=='-'||cs[j]=='*';
					}
				}
				r.good&=op;
			}
		}
		return r.good?r.value:-1;
	}

	Result E(int p){
		Result r=F(p);
		if(!r.good){
			return r;
		}
		for(; cs[r.p]=='+'||cs[r.p]=='-';){
			Result r2=F(r.p+1);
			if(!r2.good){
				return r2;
			}
			if(cs[r.p]=='+'){
				r.value+=r2.value;
			}else{
				r.value-=r2.value;
			}
			if(!r.update()){
				return r;
			}
			r.p=r2.p;
		}
		return r;
	}

	Result F(int p){
		Result r=T(p);
		if(!r.good){
			return r;
		}
		for(; cs[r.p]=='*';){
			Result r2=T(r.p+1);
			if(!r2.good){
				return r2;
			}
			r.value*=r2.value;
			if(!r.update()){
				return r;
			}
			r.p=r2.p;
		}
		return r;
	}

	Result T(int p){
		if(cs[p]=='('){
			Result r=E(p+1);
			if(!r.good||cs[r.p]!=')'){
				r.good=false;
				return r;
			}
			r.p++;
			return r;
		}else if(cs[p]=='0'||cs[p]=='1'){
			Result r=new Result(p, 0);
			for(; Character.isDigit(cs[r.p]); r.p++){
				r.value=r.value*2+cs[r.p]-'0';
				r.update();
			}
			return r;
		}else{
			return new Result(0, -1);
		}
	}

	class Result{
		int p, value;
		boolean good;

		Result(int p, int value){
			this.p=p;
			this.value=value;
			good=true;
			update();
		}

		boolean update(){
			return good&=0<=value&&value<1024;
		}
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		new Main().run();
	}
}