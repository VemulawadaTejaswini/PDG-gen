import java.util.Scanner;
class Main{
    public static void main(String[] av){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int m=sc.nextInt();
	int[][] a=new int[n][m];
	int[] b=new int[m];
	for(int i=0;i<n;i++){
	    for(int j=0;j<m;j++){
		a[i][j]=sc.nextInt();
	    }
	}
	for(int i=0;i<m;i++){
	    b[i]=sc.nextInt();
	}
	int[] c=new int[n];
	int ans;
	for(int i=0;i<n;i++){
	    for(int j=0;j<m;j++){
		c[i]=0;
		for(int k=0;k<m;k++){
			c[i]+=a[i][k]*b[k];
		}
		
	    }
	}
	for(int i=0;i<n;i++){
	    System.out.println(c[i]);
	}
    }
}

