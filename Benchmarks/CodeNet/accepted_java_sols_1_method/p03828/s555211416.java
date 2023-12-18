import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[][] yakusu=new int[168][1001];
		int[] sosu=new int[168];

		int[] eratosu=new int[1001];
		int counter=2;
		int s_c=1;
		sosu[0]=2;
		while(counter*counter<=1000) {
			for(int i=counter; i<=1000; i+=counter) {
				eratosu[i]++;
			}
			while(true) {
				counter++;
				if(eratosu[counter]==0) {
					break;
				}
			}
			sosu[s_c]=counter;
			s_c++;
		}

		for(int ax=counter+1; ax<=1000; ax++) {
			if(eratosu[ax]==0) {
				sosu[s_c]=ax;
				s_c++;
			}
		}					//エラトステネスの篩


		for(int i=2; i<=1000; i++) {
			int tmp=i;
			while(tmp>1) {
				for(int j=0; j<168; j++) {
					if(tmp%sosu[j]==0) {
						yakusu[j][i]++;
						tmp/=sosu[j];
					}
				}
			}
		}

		for(int i=0; i<168; i++) {
			for(int j=1; j<=1000; j++) {
				yakusu[i][j]=yakusu[i][j]+yakusu[i][j-1];
			}
		}

		long kotae=1;

		for(int i=0; i<168; i++) {
			kotae*=(yakusu[i][N]+1);
			kotae%=1000000007;
		}
		System.out.println(kotae);
	}
}