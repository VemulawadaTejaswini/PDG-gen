import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			if(n == 0){
				break;
			}
			int m = scan.nextInt();
			int p = scan.nextInt();
			int q = scan.nextInt();
			int r = scan.nextInt();
			String[] card = new String[n];
			for(int i = 0;i < n;i++){
				card[i] = String.valueOf(i+1);
			}
			for(int i = 0;i < m;i++){
				card = shuffle(card,scan.nextInt(),scan.nextInt(),n);
			}
			int count = 0;
			for(int i = p-1;i < q;i++){
				if(Integer.parseInt(card[i]) <= r){
					count++;
				}
			}
			System.out.println(count);
		}
	}
	
	public static String[] shuffle(String[] a,int x,int y,int n){
		String[] ans = new String[n];
		for(int i = 0;i < n-y;i++){
			ans[i] = a[i+y];
		}
		for(int i = 0;i < y-x;i++){
			ans[n-y+i] = a[i+x];
		}
		for(int i = 0;i < x;i++){
			ans[n-x+i] = a[i];
		}
		return ans;
	}
}