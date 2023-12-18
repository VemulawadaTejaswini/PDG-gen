import java.util.Scanner;

//Factorization of Quadratic Formula
public class Main{

	void run(){
		Scanner sc = new Scanner(System.in);
		int[][] signP = {{1,1},{-1,-1}};
		int[][] signM = {{1,-1},{-1,1}};
		while(true){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if((a|b|c)==0)break;
			double D = b*b-4*a*c;
			if(D<0){
				System.out.println("Impossible");continue;
			}
			boolean f = false;
			for(int r=1;r*r<=a;r++){
				if(a%r!=0||f)continue;
				int p = a/r;
				if(c==0){
					f = true;
					System.out.println(p+" "+b+" "+r+" 0");
					break;
				}
				if(c>0){
					for(int s=1;s*s<=c;s++){
						if(c%s!=0||f)continue;
						int q = c/s;
						for(int k=0;k<2;k++){
							int Q = q*signP[k][0];
							int S = s*signP[k][1];
							if(p*S+r*Q==b){
								f = true;
								System.out.println(p+" "+Q+" "+r+" "+S);
								break;
							}
							else if(p*Q+r*S==b){
								f = true;
								System.out.println(p+" "+S+" "+r+" "+Q);
								break;
							}
						}
					}
				}
				else{
					int C = -c;
					for(int s=1;s*s<=C;s++){
						if(C%s!=0||f)continue;
						int q = C/s;
						for(int k=0;k<2;k++){
							int Q = q*signM[k][0];
							int S = s*signM[k][1];
							if(p*S+r*Q==b){
								f = true;
								System.out.println(p+" "+Q+" "+r+" "+S);
								break;
							}
							else if(p*Q+r*S==b){
								f = true;
								System.out.println(p+" "+S+" "+r+" "+Q);
								break;
							}
						}
					}
				}
			}
			if(!f)System.out.println("Impossible");
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}