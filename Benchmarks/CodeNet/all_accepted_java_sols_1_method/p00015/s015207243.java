import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(bf.readLine());
		while(n-->0){
			String n1=bf.readLine();
			String n2=bf.readLine();
			int[][] a = new int[3][81];
			if(n1.length()>80||n2.length()>80){
				System.out.println("overflow");
				continue;
			}
			for(int i=0;i<81;i++)a[0][i]=a[1][i]=a[2][i]=0;
			for(int i=81-n1.length(),j=0;i<81;i++,j++)a[0][i]=Integer.parseInt(n1.substring(j,j+1));
			for(int i=81-n2.length(),j=0;i<81;i++,j++)a[1][i]=Integer.parseInt(n2.substring(j,j+1));
			for(int i=80;i>0;i--){
				a[2][i]+=a[0][i]+a[1][i];
				if(a[2][i]>=10){a[2][i]-=10;a[2][i-1]++;}
			}
			if(a[2][0]>0){
				System.out.println("overflow");
			}else{
				int i=0;
				while(i<80&&a[2][++i]==0);
				while(i<81)System.out.print(a[2][i++]);
				System.out.print("\n");
			}
		}
	}
}