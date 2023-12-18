import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			int N,M;
			N=sc.nextInt();
			M=sc.nextInt();
			if(N*M==0) {
				System.exit(0);
			}
			else {
				int r=sc.nextInt();
				int[][] students=new int[M][1440];
				for(int i=0; i<M; i++) {
					Arrays.fill(students[i],0);
				}
				for(int i=0; i<r; i++) {
					int t=sc.nextInt();
					int n=sc.nextInt();
					int m=sc.nextInt()-1;
					int s=sc.nextInt();
					if(s==1) {
						students[m][t]++;
					}
					else {
						students[m][t]--;
					}
				}
				for(int i=0; i<M; i++) {
					for(int j=1; j<1440; j++) {
						students[i][j]=students[i][j]+students[i][j-1];
					}
				}
				int[][] useage=new int[M][1440];
				for(int i=0; i<M; i++) {
					Arrays.fill(useage[i], 0);
				}
				for(int i=0; i<M; i++) {
					for(int j=1; j<1440; j++) {
						if(students[i][j]>0) {
							useage[i][j]=useage[i][j-1]+1;
						}
						else {
							useage[i][j]=useage[i][j-1];
						}
					}
				}
				int l=sc.nextInt();
				for(int i=0; i<l; i++) {
					int s=sc.nextInt();
					int g=sc.nextInt();
					int m=sc.nextInt()-1;
					if(students[m][g]>0) {
						System.out.println(useage[m][g]-useage[m][s-1]-1);
					}
					else {
						System.out.println(useage[m][g]-useage[m][s-1]);
					}
				}
			}
		}
	}
}

/*

import java.util.Arrays;
import java.util.Scanner;

class aj1148{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			int N,M;
			N=sc.nextInt();
			M=sc.nextInt();
			if(N*M==0) {
				System.exit(0);
			}
			else {
				int r=sc.nextInt();
				int[][] students=new int[M][1260-540+1];
				for(int i=0; i<M; i++) {
					Arrays.fill(students[i], 0);
				}
				for(int i=0; i<r; i++) {
					int t=sc.nextInt()-540;
					int n=sc.nextInt();
					int m=sc.nextInt()-1;
					int s=sc.nextInt();
					if(s==1) {
						students[m][t]++;
					}
					else {
						students[m][t+1]--;
					}
				}
				//query proc
				for(int i=0; i<M; i++) {
					for(int j=1; j<=1260-540; j++) {
						students[i][j]=students[i][j]+students[i][j-1];
					}
				}
				int[][] useage=new int[M][1260-540+1];
				for(int i=0; i<M; i++) {
					Arrays.fill(useage[i], 0);
				}
				for(int i=0; i<M; i++) {
					for(int j=0; j<=1260-540; j++) {
						if(j==0) {
							if(students[i][j]>0) {
								useage[i][j]=1;
							}
						}
						else {
							if(students[i][j]>0) {
								useage[i][j]=useage[i][j-1]+1;
							}
							else {
								useage[i][j]=useage[i][j-1];
							}
						}
					}
				}
				//end of query proc
				int l=sc.nextInt();
				for(int i=0; i<l; i++) {
					int s=sc.nextInt()-540;
					int g=sc.nextInt()-540;
					int m=sc.nextInt()-1;
					if(s==0) {
						System.out.println(useage[m][g]);
					}
					else {
						System.out.println(useage[m][g]-useage[m][s-1]);
					}
					/*for(int j=s; j<=g; j++) {
						System.out.println(j+" "+useage[m][j]);
					}
					//System.out.println(useage[m][g]+" "+useage[m][s-1]);
					//System.out.println(students[m][g]+" "+students[m][s-1]);
				}
			}
		}
	}
}
*/
