import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long a=sc.nextLong();
		int[] sets=new int[9];
		int[] core=new int[3];
		long res=0;
		int kaz=0;
		for(int i=0; i<262144; i++) {
			int tmp=i;
			res=0;
			core[0]=0;
			core[1]=0;
			core[2]=0;
			for(int j=0; j<9; j++) {
				sets[j]=tmp%4;
				if(tmp%4>0) {
					core[tmp%4-1]++;
				}
				tmp/=4;
			}
			int digit=0;
			int aaa=i;
			while(aaa>=4) {
				digit++;
				aaa/=4;
			}
			digit+=1;
			if(core[0]*core[1]*core[2]>0 && core[0]+core[1]+core[2]==digit) {
				long tmpp=1;
				for(int k=0; k<9; k++) {
					if(sets[k]>0) {
						res+=(sets[k]*2+1)*tmpp;
					}
					tmpp*=10;
				}
				if(res<=a) {
					kaz++;
				}
			}
		}

		System.out.println(kaz);
	}
}