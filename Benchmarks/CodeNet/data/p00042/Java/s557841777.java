import java.util.Scanner;

public class Main {
	static int n;
	static int w[];
	static int p[];
	static int W;
	static int best[];
	static int bestW;
	static int bestK;
	static int bestP;
	static int t[];
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int i,count=1;
		while(true){
			W=sc.nextInt();
			if(W==0) break;
			n=sc.nextInt();
			p=new int[n];
			w=new int[n];
			t=new int[n];
			for(i=0;i<n;i++){
				String str[]=sc.next().split(",");
				p[i]=Integer.parseInt(str[0]);
				w[i]=Integer.parseInt(str[1]);
			}
			bestP=0;
			backtrack(0,0);
			System.out.println("Case :"+count);
			System.out.println(bestP);
			System.out.println(bestW);
			count++;
		}

	}//main
	private static void backtrack(int i,int k){
		if(i==n){
			int weight=sum(t,w,k);
			if(weight <= W){
				int price=sum(t,p,k);
				if(best==null || bestP<price){
					best=new int[k];
					bestP=price;
					bestW=weight;
					for(int j=0;j<k;j++){
						best[j]=t[j];
					}
					bestK=k;
					//System.out.println(bestP+" "+bestW);
				}
			}
			return;
		}
		backtrack(i+1,k);
		t[k]=i;
		backtrack(i+1,k+1);
		return;

	}//back
	private static int sum(int a[],int b[],int k){
		int i,sum=0;
		for(i=0;i<k;i++){
			sum+=b[a[i]];
		}
		return sum;
	}
}