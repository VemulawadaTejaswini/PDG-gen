import java.util.Scanner;

public class Main {
	static int[] LIS;
	static int INF=1000000007;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();

		LIS=new int[N];
		for(int i=0; i<N; i++) {
			LIS[i]=INF;
		}
		for(int i=0; i<N; i++) {
			int tmp=sc.nextInt();
			if(i==0) {
				LIS[0]=tmp;
			}
			else {
				int insert=LIS_BinSearch(tmp);
				//System.out.println(insert+" !"+tmp);
				if(insert>=0) {
					LIS[insert]=Math.min(tmp, LIS[insert]);
				}
			}
		}
		int counter=0;
		for(int i=0; i<N; i++) {
			if(LIS[i]==INF) {
				break;
			}
			else {
				counter++;
			}
		}
		System.out.println(counter);
	}
    public static final int LIS_BinSearch(final int value) {
		int low = 0;
		int high = LIS.length;
		int mid;
		while (low < high) {
			mid = ((high - low) >>> 1) + low;    //(low + high) / 2 (オーバーフロー対策)
			if (LIS[mid] < value) {
				low = mid + 1;
			} else {
				high = mid;
			}
		}
		if(low<LIS.length) {
			return low;
		}
		else {
			return -1;
		}
	}
}

