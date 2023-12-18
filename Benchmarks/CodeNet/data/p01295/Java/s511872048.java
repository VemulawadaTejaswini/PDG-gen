import java.util.Scanner;

public class Main{

	long DIGIT_LIMIT = 1000000000000000000L; //10^18
	long MAX_NUMBER = 59477124183006535L; //pos: 999999999999999985 [10^17, MAX_NUMBER]が最終区間になる
	long[] endK; //endK[k]: 10^k未満の末尾までのインデックス数 便宜的にendK[18]=DIGIT_LIMIT, endK[0]=-1;
	long[] ten; //ten[k] = 10^k ただし、ten[0] = 0
	
	void init(){
		endK = new long[20];
		endK[0] = 0;
		long num = 9;
		for(int k=1;k<=17;k++,num*=10){
			endK[k] = endK[k-1]+k*num;
//			System.out.println("K:"+k+" ENDK:"+endK[k]);
		}
		endK[18] = DIGIT_LIMIT;
		endK[0] = -1;
		ten = new long[20];
		ten[0] = 0;
		ten[1] = 10;
		for(int k=2;k<=17;k++)ten[k]=ten[k-1]*10;
	}
	
	int at(long x){
		long L=0, R=0;
		int k;
		for(k=17;k>=0;k--)if(endK[k] < x){
			L = ten[k];
			R = k==17?MAX_NUMBER:ten[k+1];
			break;
		}
//		System.out.println(L+" "+R+" "+k);
		for(;;){
			long m = (R+L)/2;
			long p = endK[k]+1+(k+1)*(m-ten[k]);
//			System.out.println("M:"+m+" p:"+p);
			if(p<=x&&x<p+k+1){
				String s = m+"";
				for(int i=0;i<s.length();i++)if(p+i==x)return s.charAt(i)-'0';
			}
			else if(x < p)R=m;
			else L=m;
		}
	}
//	void calc_maxnum(){
//		init();
//		long L = ten[16], R = L*10;
//		while(R-L>1){
//			long m = (R+L)/2;
//			long p = endK[16]+1 + 17*(m-ten[16]);
//			System.out.println("M:"+m+" P:"+p);
//			if(p<=DIGIT_LIMIT && DIGIT_LIMIT<p+17){
//				System.out.println("M:"+m);
//				break;
//			}
//			if(DIGIT_LIMIT < p)R=m;
//			else L=m;
//		}
//	}
	void test(){
		init();
		Scanner sc = new Scanner(System.in);
		for(;;){
			int n = sc.nextInt(), k = sc.nextInt();
			if((n|k)==0)break;
		for(int i=0;i<k;i++){
//			System.out.println("pos:"+(n+i));
			System.out.print(at(n+i));
		}
		System.out.println();
		}
	}
	
	public static void main(String[] args) {
		new Main().test();
	}
}