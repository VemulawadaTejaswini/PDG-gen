import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);int N=sc.nextInt();long C=sc.nextLong();
		long[][] sushi=new long[N][2];long[][] migi=new long[N][2];long[][] hidari=new long[N][2];long max_cal=0;
		for(int i=0; i<N; i++) {
			sushi[i][0]=sc.nextLong();sushi[i][1]=sc.nextLong();
		}
		migi[0][0]=sushi[0][0];migi[0][1]=sushi[0][1];
		for(int i=1; i<N; i++) {
			migi[i][0]=sushi[i][0];migi[i][1]=migi[i-1][1]+sushi[i][1];
		}
		for(int i=0; i<N; i++) {
			migi[i][1]-=migi[i][0];
			if(migi[i][1]>=0) {
				max_cal=Math.max(max_cal, migi[i][1]);
			}
		}
		hidari[0][0]=C-sushi[N-1][0];hidari[0][1]=sushi[N-1][1];
		for(int i=1; i<N; i++) {
			hidari[i][0]=C-sushi[N-1-i][0];hidari[i][1]=hidari[i-1][1]+sushi[N-1-i][1];
		}
		long[][] gyaku=new long[N][2];
		if(hidari[0][1]-hidari[0][0]>0) {
			gyaku[0][0]=hidari[0][1]-hidari[0][0];gyaku[0][1]=0;
		}
		else {
			gyaku[0][0]=0;gyaku[0][1]=-1;
		}
		for(int i=1; i<N; i++) {
			if(hidari[i][1]-hidari[i][0]>gyaku[i-1][0]) {
				gyaku[i][0]=hidari[i][1]-hidari[i][0];gyaku[i][1]=i;
			}
			else {
				gyaku[i][0]=gyaku[i-1][0];gyaku[i][1]=gyaku[i-1][1];
			}
		}
		for(int i=0; i<N-1; i++) {
			migi[i][1]-=migi[i][0];long tmp=migi[i][1]+gyaku[N-2-i][0];max_cal=Math.max(tmp,max_cal);
		}
		hidari[0][0]=C-sushi[N-1][0];hidari[0][1]=sushi[N-1][1];
		for(int i=1; i<N; i++) {
			hidari[i][0]=C-sushi[N-1-i][0];hidari[i][1]=hidari[i-1][1]+sushi[N-1-i][1];
		}
		for(int i=0; i<N; i++) {
			hidari[i][1]-=hidari[i][0];
			if(hidari[i][1]>=0) {
				max_cal=Math.max(max_cal, hidari[i][1]);
			}
		}
		migi[0][0]=sushi[0][0];migi[0][1]=sushi[0][1];
		for(int i=1; i<N; i++) {
			migi[i][0]=sushi[i][0];migi[i][1]=migi[i-1][1]+sushi[i][1];
		}
		if(migi[0][1]-migi[0][0]>0) {
			gyaku[0][0]=migi[0][1]-migi[0][0];gyaku[0][1]=0;
		}
		else {
			gyaku[0][0]=0;gyaku[0][1]=-1;
		}
		for(int i=1; i<N; i++) {
			if(migi[i][1]-migi[i][0]>gyaku[i-1][0]) {
				gyaku[i][0]=migi[i][1]-migi[i][0];gyaku[i][1]=i;
			}
			else {
				gyaku[i][0]=gyaku[i-1][0];gyaku[i][1]=gyaku[i-1][1];
			}
		}
		for(int i=0; i<N-1; i++) {
			hidari[i][1]-=hidari[i][0];long tmp=hidari[i][1]+gyaku[N-2-i][0];max_cal=Math.max(tmp,max_cal);
		}
		System.out.println(max_cal);
		sc.close();
	}
}