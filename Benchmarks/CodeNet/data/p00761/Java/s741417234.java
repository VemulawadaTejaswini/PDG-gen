import java.util.Scanner;

public class Main{
	//static int[] d=new int[4];

	static int line(int x, int el) {
		int[] d=new int[el+1];
		int max=0, min=0;
		for(int i=0; i<el; i++) {
			d[i]=x%10; //ｘのi桁目がd[i]に格納
			x=x/10;
		}
		for(int i=0; i<el; i++) {
			for(int j=i+1; j<el; j++) {
				if(d[i]>d[j]) {
					int tmp=d[i];
					d[i]=d[j];
					d[j]=tmp;
				}
			}
		}//昇順にソート
		for(int i=0; i<el; i++) {
			max+=d[el-1-i];
			max*=10;
			min+=d[i];
			min*=10;
		}
		return max/10-min/10;
		
	}
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			while(sc.hasNext()) {
				int[] a=new int[22];
				a[0]=sc.nextInt();
				int L=sc.nextInt();
				if(a[0]==0 && L==0) {
					break;
				}
				int[] d=new int[10];
				int check=0, ai=0, aj=0;
				for(int i=1; i<=20; i++) {
					a[i]=line(a[i-1], L);
					for(int j=0; j<i; j++) {
						if(a[j]==a[i]) {
							ai=i;
							aj=j;
							check=1;
							break;
						}
					}
					if(check==1) {
						break;
					}
				}
				//System.out.printf("%d %d %d\n",a[0], d[0], a[3]);
				System.out.printf("%d %d %d\n", aj, a[ai], ai-aj);
			}
		}
	}
}
