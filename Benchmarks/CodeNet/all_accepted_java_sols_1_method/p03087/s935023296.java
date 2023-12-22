import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		String s = sc.next();
		int[] ans=new int[n];
		int k =0; 
		for(int i = 1; i<n; i++){
			if(s.substring(i-1,i+1).equals("AC")){
				k++;
			}
			ans[i]=k;
		}
		for(int i = 0; i<q; i++){
			int l = sc.nextInt()-1;
			int r = sc.nextInt()-1;
			System.out.println(ans[r]-ans[l]);
		}
	}
}
