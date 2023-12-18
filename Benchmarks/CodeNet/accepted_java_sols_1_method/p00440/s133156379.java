import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		for(;;){
			int n = sc.nextInt(),k=sc.nextInt();
			if(n+k==0)break;
			int[] a = new int[k];
			for(int i=0;i<k;i++){
				a[i]=sc.nextInt();
			}
			Arrays.sort(a);
			List<int[]>list=new ArrayList<int[]>();
			int max=-1;
			for(int i=0;i<k;i++){
				if(a[i]==0)continue;
				int tmpi=i;
				int tmp=a[i];
				int cnt=1;
				for(int j=i+1;j<k;j++){
					if(a[j]==tmp+1){
						tmp++;
						i++;
						cnt++;
					}
				}
//				System.out.println(a[tmpi]+" "+a[i]);
				max=Math.max(max,a[i]-a[tmpi]+1);
				list.add(new int[]{a[tmpi],a[i]});
			}
//			System.out.println(max);
			int[][] b = list.toArray(new int[0][0]);
			if(a[0]==0){
				for(int i=0;i<b.length-1;i++){
					if(b[i][1]==b[i+1][0]-2){
//						System.out.println(i);
//						System.out.println(b[i][0]+" "+b[i][1]);;
//						System.out.println(b[i+1][0]+" "+b[i+1][1]);;
						max=Math.max(max, (b[i][1]-b[i][0]+1) + 1 + (b[i+1][1]-b[i+1][0]+1));
					}
				}				
			}
			System.out.println(max);
		}
	}
}