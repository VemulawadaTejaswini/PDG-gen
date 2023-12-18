import java.util.*;
import java.io.*;
public class Main {

	static Scanner inp= new Scanner(System.in);
	static PrintWriter out= new PrintWriter(System.out);
	public static void main(String args[]) {		    	
	   	Main g=new Main();
	   	g.main();
	   	out.close();
	}

	
	
	//Main
	void main() {
		
		int n=inp.nextInt();
		int a[]=new int[n];
		int N=(int)1e6+1;
		int sp[]=new int[N];
		sp[1]=1;
		for(int i=2;i<N;i++) {
			if(sp[i]==0) {
				for(int j=i;j<N;j+=i) {
					if(sp[j]==0) sp[j]=i;
				}
			}
		}
		for(int i=0;i<n;i++) {
			a[i]=inp.nextInt();
		}
		//for(int i=0;i<=6;i++) System.out.println(sp[i]);
		int usedIndex[]=new int[N];
		Arrays.fill(usedIndex, -1);
		boolean pairCo=true;
		loop:
		for(int i=0;i<n;i++) {
			int x=a[i];
			while(x>1) {
				if(usedIndex[sp[x]]!=-1 && usedIndex[sp[x]]!=i) {
					pairCo=false;
					break loop;
				}
				usedIndex[sp[x]]=i;
				x/=sp[x];
			}
		}
		if(pairCo) {
			System.out.println("pairwise coprime");
		}else {
			int x=a[0];
			for(int i=1;i<n;i++) {
				x=gcd(x,a[i]);
			}
			System.out.println(x==1?"setwise coprime":"not coprime");
		}
	}
    
    static int gcd(int a, int b) {
    	return b==0?a:gcd(b,a%b);
    }
		
}
