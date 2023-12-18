import java.util.*;
class Main{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int a;
		while(true){
			a=s.nextInt();
			if(a==0)System.exit(0);
			int ret=1;
			int B=5;
			int U=1;
			int R=3;
			int L=4;
			int F=2;
			int D=6;
			for(int i=0;i<a;i++){
				String str=s.next();
				if(str.equals("North")){
					int newB=U;
					int newU=F;
					int newD=B;
					int newF=D;
					B=newB;
					U=newU;
					F=newF;
					D=newD;
				}
				if(str.equals("East")){
					int newU=L;
					int newL=D;
					int newR=U;
					int newD=R;
					U=newU;
					L=newL;
					R=newR;
					D=newD;
				}
				if(str.equals("South")){
					int newB=D;
					int newU=B;
					int newD=F;
					int newF=U;
					B=newB;
					U=newU;
					F=newF;
					D=newD;
				}
				if(str.equals("West")){
					int newU=R;
					int newL=U;
					int newR=D;
					int newD=L;
					U=newU;
					L=newL;
					R=newR;
					D=newD;
				}
				if(str.equals("Right")){
					int newF=R;
					int newB=L;
					int newR=B;
					int newL=F;
					F=newF;
					B=newB;
					R=newR;
					L=newL;
				}
				if(str.equals("Left")){
					int newF=L;
					int newB=R;
					int newR=F;
					int newL=B;
					F=newF;
					B=newB;
					R=newR;
					L=newL;
				}
				ret+=U;
			}
			System.out.println(ret);
		}
	}
}

