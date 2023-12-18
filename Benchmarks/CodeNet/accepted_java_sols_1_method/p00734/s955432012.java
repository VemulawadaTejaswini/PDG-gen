import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n==0&&m==0) break;
			int[] nc = new int[n];
			int[] mc = new int[m];
			for(int i=0;i<n;++i){
				nc[i]=sc.nextInt();
			}
			for(int i=0;i<m;++i){
				mc[i]=sc.nextInt();
			}
			int num=1000000,ans_n=0,ans_m=0;
			boolean flag=false;
			for(int j=0;j<m;++j){
				for(int i=0;i<n;++i){
					int[] ncp = nc.clone();
					int[] mcp = mc.clone();
					int a=ncp[i];
					ncp[i]=mcp[j];
					mcp[j]=a;
					int sum_n=0,sum_m=0;
					for(int z=0;z<n;++z) sum_n+=ncp[z];
					for(int z=0;z<m;++z) sum_m+=mcp[z];
					if((sum_n==sum_m) && (ncp[i]+mcp[j]<num)){
						num=ncp[i]+mcp[j];
						ans_n=mcp[j];
						ans_m=ncp[i];
						flag=true;
					}
				}
			}
			if(flag==true) System.out.println(ans_n+" "+ans_m);
			else System.out.println("-1");
		}
	}
}
