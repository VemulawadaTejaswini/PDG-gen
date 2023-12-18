import java.util.*;
import java.util.Scanner;
import static java.lang.Math.*;
public class Main {
	final Scanner sc=new Scanner(System.in);
	final int INF=Integer.MAX_VALUE/4;
	public static void main(String[] args) {
		new Main().doIt();
	}
	void doIt(){
		new AOJ1225();
	}
	
	// 21:50-22:16 22:30
	// ICPC Asia Japan 2001 B
	class AOJ1225{
		AOJ1225(){
			while(true){
				ArrayList<Deal> sell=new ArrayList<Deal>(),buy=new ArrayList<Deal>();
				HashMap<String,Dealer> dealer=new HashMap<String,Dealer>();
				HashMap<String,Commodities> comm=new HashMap<String, Commodities>();
				int N=sc.nextInt();
				if(N==0)	break;
				for(int I=0; I<N; I++){
					String d=sc.next(),ff=sc.next(),c=sc.next();
					int a=sc.nextInt();
					boolean f=ff.equals("BUY");
					if(!dealer.containsKey(d))	dealer.put(d, new Dealer(0, 0));
					ArrayList<Deal> tmp=(f?sell:buy);
					int idx=-1;
					for(int i=0; i<tmp.size(); i++){
						int m=(f?INF:-1);
						if(tmp.get(i).c.equals(c) && !tmp.get(i).d.equals(d) && (f?m>a:m<a) && (f?a>=tmp.get(i).a:a<=tmp.get(i).a)){
							m=a;	idx=i;
						}
					}
					if(idx>=0){
						a=(a+tmp.get(idx).a)/2;
						if(!comm.containsKey(c))	comm.put(c, new Commodities(a));
						else	comm.get(c).add(a);
						dealer.get(d).add(f?0:a, f?a:0);
						dealer.get(tmp.get(idx).d).add(f?a:0, f?0:a);
					}else{
						tmp=(!f?sell:buy);
						tmp.add(new Deal(d,c,a));
					}
				}
				ArrayList<String> keys=new ArrayList<String>();
				for(String key:comm.keySet())	keys.add(key);
				Collections.sort(keys);
				for(String key:keys){
					Commodities now=comm.get(key);
					System.out.println(key+" "+now.min+" "+now.getAve()+" "+now.max);
				}
				System.out.println("--");
				keys.clear();
				for(String key:dealer.keySet())	keys.add(key);
				Collections.sort(keys);
				for(String key:keys)	System.out.println(key+" "+dealer.get(key).out+" "+dealer.get(key).in);
				System.out.println("----------");
			}
		}
		class Deal{
			String d,c;	int a;
			Deal(String d,String c,int a){	this.d=d; this.c=c; this.a=a;}
		}
		class Dealer{
			int in,out;
			Dealer(int in,int out){this.in=in; this.out=out;}
			void add(int in,int out){this.in+=in; this.out+=out;}
		}
		class Commodities{
			int max,min,sum,num;
			Commodities(int a){
				this.max=a; this.min=a; this.sum=a;
				this.num=1;
			}
			void add(int a){
				this.max=max(this.max,a);	this.min=min(this.min,a);
				this.sum+=a;	this.num++;
			}
			int getAve(){ return this.sum/this.num;}
		}
	}

}