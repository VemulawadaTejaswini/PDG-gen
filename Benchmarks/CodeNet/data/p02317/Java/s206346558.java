import java.util.ArrayList;
import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		new Main().solve();
	}
	void solve(){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		System.out.println(LIS(a));
	}
	//Longest Increasing Sequence
	//?????????:LIS?????????
	int LIS(int[] a){
		int n=a.length;
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=0;i<n;i++){
			if(list.isEmpty()||a[i]>list.get(list.size()-1)){
				list.add(a[i]);
			}else{
				//a[i]????????§?????????????????°??????????????????
				int first=0;
				int last=list.size()-1;
				while(first+1!=last&&first!=last){
					int mid=(first+last)/2;
					if(list.get(mid)>a[i]){
						last=mid;
					}else{
						first=mid;
					}
					System.out.println(first+" "+last);
				}
				list.set(last, a[i]);
			}
		}
		return list.size();
	}
}