import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long[] jyogai=new long[1000];

		for(int i=0; i<1000; i++) {
			jyogai[i]=(i+2)*(i+1)/2;
		}

		for(int i=1; i<1000; i++) {
			jyogai[i]=jyogai[i]+jyogai[i-1];
		}

		for(int i=0; i<1000; i++) {
			jyogai[i]*=4;
		}
		while(sc.hasNext()) {
			long Sigma=sc.nextLong();

			if(Sigma>2000) {
				Sigma=4000-Sigma;
			}

			long answer=(Sigma+3)*(Sigma+2)*(Sigma+1)/6;
			if(Sigma>1000) {
				answer-=jyogai[(int) (Sigma-1001)];
			}
			System.out.println(answer);

		}
	}
}
