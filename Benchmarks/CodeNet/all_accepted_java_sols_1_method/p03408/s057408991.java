import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] EM=new String[100];
		int[] EM_CNT=new int[100];
		int em_cnt=0;
		boolean em_find=false;
		String[] EN=new String[100];
		int[] EN_CNT=new int[100];
		int en_cnt=0;
		boolean en_find=false;
		String source="";

		for(int i=0; i<100; i++) {
			EM_CNT[i]=0;
			EN_CNT[i]=0;
		}
		int kosu1=sc.nextInt();
		for(int i=0; i<kosu1; i++) {
			source=sc.next();
			em_find=false;
			if(em_cnt==0) {
				EM[0]=source;
				EM_CNT[0]++;
				em_cnt++;
			}
			else {
				for(int j=0; j<em_cnt; j++) {
					if(EM[j].equals(source)) {
						em_find=true;
						EM_CNT[j]++;
						break;
					}
				}
				if(em_find==false) {
					EM[em_cnt]=source;
					EM_CNT[em_cnt]++;
					em_cnt++;
				}
			}
		}

		int kosu2=sc.nextInt();
		for(int i=0; i<kosu2; i++) {
			source=sc.next();
			en_find=false;
			if(en_cnt==0) {
				EN[0]=source;
				EN_CNT[0]++;
				en_cnt++;
			}
			else {
				for(int j=0; j<en_cnt; j++) {
					if(EN[j].equals(source)) {
						en_find=true;
						EN_CNT[j]++;
						break;
					}
				}
				if(en_find==false) {
					EN[en_cnt]=source;
					EN_CNT[en_cnt]++;
					en_cnt++;
				}
			}
		}
		int max=-114514810;
		String moji="";
		String tm2="";
		int tmp=0;
		for(int i=0; i<em_cnt; i++) {
			moji=EM[i];
			tmp=EM_CNT[i];

			for(int j=0; j<en_cnt; j++) {
				if(EN[j].equals(moji)) {
					tmp-=EN_CNT[j];
				}
			}

			if(tmp>max) {
				max=tmp;
			}
		}
		if(max>=0) {
			System.out.println(max);
		}
		/*else {
			for(int i=0; i<en_cnt; i++) {
				en_find=false;
				tm2=EN[i];

				for(int j=0; j<em_cnt; j++) {
					if(tm2.equals(EM[j])) {
						en_find=true;
						break;
					}
				}
				if(en_find==false) {
					if(-1*EN_CNT[i]>max) {
						max=-1*EN_CNT[i];
					}
				}
			}
			System.out.println(max);
		}*/
		else {
			System.out.println("0");
		}
	}
}