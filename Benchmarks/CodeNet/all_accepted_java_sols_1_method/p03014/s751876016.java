import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt(),w=sc.nextInt();
		char[][] array = new char[h][w];
		int[][] ans = new int[h][w];
		for(int i=0;i<h;i++) array[i]=sc.next().toCharArray();
		sc.close();
		for(int i=0;i<h;i++) {
			int count=0;
			for(int j=0;j<w;j++) {
				if(array[i][j]=='.') count++;
				else {
					for(int k=1;k<=count;k++) ans[i][j-k]=count;
					count=0;
				}
			}
			for(int k=1;k<=count;k++) ans[i][w-k]=count;
		}
		for(int i=0;i<w;i++) {
			int count=0;
			for(int j=0;j<h;j++) {
				if(array[j][i]=='.') count++;
				else {
					for(int k=1;k<=count;k++) ans[j-k][i]+=count;
					count=0;
				}
			}
			for(int k=1;k<=count;k++) ans[h-k][i]+=count;
		}
		int max=0;
		for(int i=0;i<h;i++) {
			for(int j=0;j<w;j++) {
				if(ans[i][j]-1>max) max=ans[i][j]-1;
			}
		}
		System.out.println(max);
	}
}