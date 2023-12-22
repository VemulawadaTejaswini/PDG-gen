import java.util.Scanner;

public class Main {
	public static Scanner sc;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		int n[]=new int[15];
		int score[][]=new int[15][1000];
		double ans[]=new double[1000];
		int i=0;
		int count=0;
		for(;;) {
			n[i]=sc.nextInt();
			if(n[i]==0) {
				break;
			}
			for(int j=0;j<n[i];j++) {
				score[i][j]=sc.nextInt();
				//System.out.print(i+" "+j+"="+score[i][j]+"\n");
			}
			i++;
			count++;
		}
		//平均の取得
		double m[]=new double[15];
		int sum=0;
		for(i=0;i<count;i++) {
			for(int j=0;j<n[i];j++) {
				sum+=score[i][j];
			}
			m[i]=(double)sum/n[i];
			//System.out.println(i+" "+m[i]);
			sum=0;
		}
		//標準偏差
		double Sum=0;
		for(i=0;i<count;i++) {
			for(int j=0;j<n[i];j++) {
				Sum+=(double)(score[i][j]-m[i])*(score[i][j]-m[i]);
				//System.out.print(i+" "+j+":"+Sum+"\n");
			}
			ans[i]=Math.sqrt((double)Sum/n[i]);
			//System.out.print(ans[i]);
			Sum=0;
		}
		for(i=0;i<count;i++) {
			System.out.printf("%.08f\n",ans[i]);
		}
	}
}

