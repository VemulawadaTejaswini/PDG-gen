import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		while(true){
		int n=s.nextInt();
		if(n==0)System.exit(0);
		int[] table=new int[n];
		for(int i=0;i<table.length;i++){
			table[i]=s.nextInt();
		}
		int min=1000000;
		int aaa=0;
		for(int i=0;i<table.length;i++){
			int[] nowtable=table.clone();
			nowtable[i]=1;
			if((aaa=solve(nowtable))<min)min=aaa;
			//System.out.println(Arrays.toString(nowtable));
			nowtable[i]=2;
			solve(nowtable);
			if((aaa=solve(nowtable))<min)min=aaa;
			//System.out.println(Arrays.toString(nowtable));
			nowtable[i]=3;
			solve(nowtable);
			if((aaa=solve(nowtable))<min)min=aaa;
			//System.out.println(Arrays.toString(nowtable));
			nowtable[i]=table[i];
		}
		//System.out.println(solve(table));
		System.out.println(min);
		}
	}

	static int solve(int[] takeshiw){
		int now=0;
		int val=0;
		int[] takeshi=takeshiw.clone();
		for(int i=0;i<takeshi.length+1;++i){
			if(i==takeshi.length){
				if(val>=4){
					int yaranaika=i;
					for(int j=yaranaika-1;j>yaranaika-val-1;j--){
						if(takeshi[j]==0)yaranaika--;
						takeshi[j]=0;
					}
				}
			}else if(takeshi[i]==0){
				//System.out.println("B");
			}else if(now==0){
				now=takeshi[i];
				val++;
				//System.out.println("A");
			}else if(now==takeshi[i]){
				val++;
				//System.out.println("C");
			}else if(val>=4){
				int yaranaika=i;
				for(int j=yaranaika-1;j>yaranaika-val-1;j--){
					if(takeshi[j]==0)yaranaika--;
					takeshi[j]=0;
				}
				i=0;
				if(i<0)i=0;
				now=takeshi[i];
				val=1;
				//System.out.println("D");
			}else{
				val=1;
				now=takeshi[i];
				//System.out.println("E");
			}
		}
		int kiyoto=0;
		for(int i=0;i<takeshi.length;i++){
			if(takeshi[i]!=0)kiyoto++;
		}
		//System.out.println(Arrays.toString(takeshi));
		return kiyoto;
	}
}