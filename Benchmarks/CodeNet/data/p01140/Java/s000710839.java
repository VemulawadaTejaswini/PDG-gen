
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static int N,M;
	static int[] h,w,sumh,sumw;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(;;){
			N=sc.nextInt();
			M=sc.nextInt();
			if(N+M==0)break;
			h=new int[N];
			sumh=new int[N+1];
			w=new int[M];
			sumw=new int[M+1];
			for(int i=0;i<N;i++){
				h[i]=sc.nextInt();
				sumh[i+1]=h[i]+sumh[i];
			}
			for(int i=0;i<M;i++){
				w[i]=sc.nextInt();
				sumw[i+1]=w[i]+sumw[i];
			}
			int cnt=0;
			int[] a = new int[(M+1)*M/2];
			for(int j=0;j<M;j++){
				for(int jj=j+1;jj<=M;jj++){
					a[cnt++]=sumw[jj]-sumw[j];
				}
			}
			Arrays.sort(a);
//			System.out.println(Arrays.toString(sumw));
//			System.out.println(Arrays.toString(a));
			cnt=0;
			for(int i=0;i<N;i++){
				
				for(int ii=i+1;ii<=N;ii++){
					int u = upperBound(a,sumh[ii]-sumh[i]);
					int l = lowerBound(a,sumh[ii]-sumh[i]);
					int d = Arrays.binarySearch(a,sumh[ii]-sumh[i]);
					if(d>=0)cnt+=u-l;
				}
			}
			
			
			System.out.println(cnt);
			
		}
	}
	public static int lowerBound(int[] a, int x){
		int left = 0;
		int right = a.length;
		while(true){
			if(right-left<=1){
				return a[left]>=x?left:right;
			}
			else{
				int m = (left+right)/2;
				if(a[m]>=x){
					right = m;
				}
				else{
					left = m;
				}
			}
		}
	}
	
	/**
	 * テ」ツつステ」ツδシテ」ツδ暗ヲツクツ暗」ツ?ソテゥツ?催・ツ按預テ」ツ?凝」ツつ?x<a[i] テ」ツ?ィテ」ツ?ェテ」ツつ凝」ツつ暗」ツ??」ツ?ェテヲツ慊?・ツーツ湘」ツ?ョ i テ」ツつ津ィツソツ氾」ツ??
	 * テ・ツソツ愿ァツ板ィテッツシツ?
	 * テゥツ?催・ツ按療、ツクツュテ」ツ?ョティツヲツ?ァツエツ?」ツ?ァテ・ツ、ツァテ」ツ?催」ツ?陛」ツ??x テ、ツサツ・テ、ツクツ凝」ツ?ョティツヲツ?ァツエツ?ヲツ閉ーテ」ツつ津・ツ渉姪」ツ?」テ」ツ?ヲテ」ツ?湘」ツつ凝」ツ?ェテ」ツ?ゥ
	 * @param a
	 * @param x
	 * @return
	 */
	public static int upperBound(int[] a, int x){
		int left = 0;
		int right = a.length;
		while(true){
			if(right-left<=1){
				return a[left]>x?left:right;
			}
			else{
				int m = (left+right)/2;
				if(a[m]>x){
					right = m;
				}
				else{
					left = m;
				}
			}
		}
	}
}