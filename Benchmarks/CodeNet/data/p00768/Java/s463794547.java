import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int m=sc.nextInt();
			int t=sc.nextInt();
			int p=sc.nextInt();
			int r=sc.nextInt();
			if((m==0&&t==0)&&(p==0&&r==0)) break;
			int[][] data = new int[3+p][t];
			for(int i=0;i<r;++i){
				int mi=sc.nextInt();
				int ti=sc.nextInt();
				int pi=sc.nextInt();
				int ji=sc.nextInt();
				if(ji==0){
					data[0][ti-1]++;
					data[1][ti-1]+=mi+20*data[2+pi][ti-1];
				} else {
					data[2+pi][ti-1]++;
				}
			}
			int item=0;
			while(true){
				int max=0,time=0,count=0;
				if(item==t) break;
				for(int j=0;j<t;++j){
					if(max<data[0][j]&&data[2][j]==0){
						max=data[0][j]; time=data[1][j]; count=1;
					} else if(max==data[0][j]&&data[2][j]==0){
						if(data[1][j]<time){
							time=data[1][j]; count=1;
						} else if(data[1][j]==time){
							count++;
						}
					}
				}
				for(int i=0;i<count;++i){
					for(int j=t-1;j>=0;--j){
						if((data[0][j]==max && data[1][j]==time)&&data[2][j]==0){
							System.out.print(j+1);
							data[2][j]=1;
							j=-1;
						}
					}
					if(item+1!=t){
						if(count==1||i==count-1&&(item+count!=t)){ System.out.print(","); }
						else if(i<count-1){ System.out.print("="); }
					}
				}
				item+=count;
			}
			System.out.println();
		}
	}
}

