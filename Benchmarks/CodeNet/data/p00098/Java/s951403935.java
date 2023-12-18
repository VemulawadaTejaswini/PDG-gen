import java.util.Scanner;

public class Main {
	
	public static void cum(int sum[][]){//左上からの累積和計算
	    for(int i=0;i<sum.length;i++){
	    	for(int j=1;j<sum[i].length;j++){
	    		sum[i][j]+=sum[i][j-1];
	    	}
	    }
	    for(int i=1;i<sum.length;i++){
	    	for(int j=0;j<sum[i].length;j++){
	    		sum[i][j]+=sum[i-1][j];
	    	}
	    }
	}
	public static int cumsum(int a,int b,int c,int d,int sum[][]){//(a,b)より(c,d)の方が右下
		int cum=sum[c][d];
		if(b>0){cum-=sum[c][b-1];}
		if(a>0){cum-=sum[a-1][d];}
		if(a>0 && b>0){cum+=sum[a-1][b-1];}
		return cum;
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[][]=new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				a[i][j]=sc.nextInt();
			}
		}
	cum(a);
	int ans=0;
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			for(int p=i;p<n;p++){
				for(int q=j;q<n;q++){
					ans=Math.max(cumsum(i,j,p,q,a),ans);
				}
			}
		}
	}
	System.out.println(ans);
	
	}}