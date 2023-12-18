import java.util.Scanner;
 
class Main {
	
	public static void cum(long sum[][]) {//左上からの累積和計算
		for (int i = 0; i < sum.length; i++) {
			for (int j = 1; j < sum[i].length; j++) {
				sum[i][j] += sum[i][j - 1];
			}
		}
		for (int i = 1; i < sum.length; i++) {
			for (int j = 0; j < sum[i].length; j++) {
				sum[i][j] += sum[i - 1][j];
			}
		}
	}

	public static long cumsum(int a, int b, int c, int d, long sum[][]) {//(a,b)より(c,d)の方が右下
		long cum = sum[c][d];
		if (b > 0) {
			cum -= sum[c][b - 1];
		}
		if (a > 0) {
			cum -= sum[a - 1][d];
		}
		if (a > 0 && b > 0) {
			cum += sum[a - 1][b - 1];
		}
		return cum;
	}
 
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        long map[][]=new long[n][m];
        for(int i=0;i<n;i++){
        	char s[]=sc.next().toCharArray();
        	for(int j=0;j<m;j++){
        		if(s[j]=='I')map[i][j]=1;
        		else if(s[j]=='O')map[i][j]=2000000;
        		else if(s[j]=='J')map[i][j]=4000000000000L;
        	}
        }
        cum(map);
        int a[]=new int[k];
        int b[]=new int[k];
        int c[]=new int[k];
        int d[]=new int[k];
        for(int i=0;i<k;i++){
        	a[i]=sc.nextInt()-1;
        	b[i]=sc.nextInt()-1;
        	c[i]=sc.nextInt()-1;
        	d[i]=sc.nextInt()-1;
        }
        for(int i=0;i<k;i++){
        	long x=cumsum(a[i],b[i],c[i],d[i],map);
        	int j=(int)(x/4000000000000L);
        	int o=(int)((x-j*4000000000000L)/2000000);
        	int ii=(int)(x-j*4000000000000L-o*2000000);
        	System.out.println(j+" "+o+" "+ii);
        }
    }}
        