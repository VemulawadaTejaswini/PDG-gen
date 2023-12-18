import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] tr = new int[1000];
		int[] trs = new int[1000];
		int sp = 0;
		while(scan.hasNext()){
			String str = scan.nextLine();
			if(str.equals("") || str.equals(" ")){
				continue;
			}
			String[] str2 = str.split(",");
			int c = Integer.parseInt(str2[0]);
			int i = 0;
			for(i = 0;i < sp;i++){
				if(trs[i] == c){
					tr[i]++;
					break;
				}
			}
			if(i == sp){
				tr[sp] = 1;
				trs[sp++] = c;
			}
		}
		for(int j = 0;j < sp;j++){
			for(int k = sp-1;k > j;k--){
				if(trs[k] < trs[k-1]){
					swap(trs,tr,k,k-1);
				}
			}
		}
		for(int j = 0;j < sp;j++){
			if(tr[j] > 1){
				System.out.println(trs[j] + " " + tr[j]);
			}
		}
	}
	public static void swap(int[] s,int[] a,int i,int j){
		int t = a[j];a[j] = a[i];a[i] = t;
		int tt = s[i];s[i] = s[j];s[j] = tt;
	}
}