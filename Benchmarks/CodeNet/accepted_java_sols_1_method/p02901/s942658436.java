import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] a = new int[m];
		int[] b = new int[m];

		int[][] c = new int[m][n];

		for(int i=0;i<m;i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			for(int j=0;j<b[i];j++) {
				c[i][j] = sc.nextInt();
			}
		}

		int[] d = new int[(int) Math.pow(2,n)];
		d[0]=0;	
		for(int j =1;j<Math.pow(2,n);j++) {
			d[j]=(int) 1e9;
		}
		

		int index=0;
		for(int j=0;j<b[0];j++) {
			 index+= Math.pow(2,c[0][j]-1);
		}
		d[index]=a[0];
		
		int[] pow = new int[n+1];
		for(int i = 0;i<n+1;i++) {
			pow[i] = (int) Math.pow(2,i);
		}
		

		for(int i =1;i<m;i++) {
			for(int j=0;j<(int) Math.pow(2,n);j++) {
				if(d[j]<1e9) {
					int target = j;
					for(int k =0;k<b[i];k++) {
						if(j%pow[c[i][k]]>=pow[c[i][k]-1]) {
						}else {
							target += pow[c[i][k]-1];
						}
					}
					if(d[target]>d[j]+a[i])d[target]=d[j]+a[i];

				}
			}

		}
		if( d[(int) Math.pow(2,n)-1]<1e9) {
			System.out.println( d[(int) Math.pow(2,n)-1]);
		}else {
			System.out.println(-1);
		}



		/*
		TreeMap<Integer,Integer> treeMap = new TreeMap<>();
		treeMap.put(b[n], n);
		*/

	}

}
/*
class City{
	int order;
	int prefecture;
	int year;
	int number;
	City(int order,int prefecture, int year){
		this.order = order;
		this.prefecture = prefecture;
		this.year = year;
	}
}
*/
