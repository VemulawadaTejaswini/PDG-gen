import java.util.*;
public class Main {
	static int j;  /*j:判定*/
	static String x;
	static void solve(int a,int b){
		if(a>=b){
			return;
		}
		int k=0,m=0,n=0;
		m=x.charAt(a);
		if(m==40 || m==91){
			for(int i=a;i<b;i++){
				n=x.charAt(i);
				if(n==41 || n==93){
					k--;
				}
				if(n==40 || n==91){
					k++;
				}
				if(k==0){
				    if(m==40 && n==93 || m==91 && n==41){
				    	j++;
				    }
				    else{
				    	solve(a+1,i);
				    	solve(i+1,b);
				    }
					return;	
				}
				if(n==46){
					j++;
			}
		}
		}
		if(m==41 || m==93){
			j++;
		}
		solve(a+1,b);
	}
	public static void main(String[] args){
		Scanner cin = new Scanner(System.in);
		while(true){
			j=0;
			x=cin.nextLine();
			if(x.equals(".")){
				break;
			}
				solve(0,x.length()); 
			
				if(j==0){
					System.out.println("yes");
				}
				if(j>0){
					System.out.println("no");
				}
		}
	}
	}