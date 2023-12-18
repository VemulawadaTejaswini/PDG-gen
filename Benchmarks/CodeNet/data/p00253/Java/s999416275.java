import java.util.Scanner;


public class Main {

	Scanner sc;
	
	int ni(){
		return sc.nextInt();
	}
	
	int solve(int h[], int n){
		for(int skip=0;skip<=n;++skip){
			int diff=-1, dh=-1, prev=-1;
			boolean ac=true;
			for(int i=0;i<=n;++i){
				if(i==skip) continue;
				
				if(prev!=-1){
					if(diff==-1){
						diff=prev-h[i];
					}
					else{
						dh=prev-h[i];
						if(dh!=diff){
							ac=false;
							break;
						}
					}
				}
				prev=h[i];
			}
			if(ac) return h[skip];
		}
		return -1;
	}
	
	void io(){
		int n;
		sc=new Scanner(System.in);
		
		while((n=ni())!=0){
			int h[]=new int[n+1];
			for(int i=0;i<n+1;++i){
				h[i]=ni();
			}
			System.out.println(solve(h, n));
		}
		sc.close();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().io();
	}

}