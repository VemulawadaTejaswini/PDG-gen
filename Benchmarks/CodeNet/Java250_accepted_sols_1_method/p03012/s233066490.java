import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int []w = new int [n];
		
		for(int i =0; i < n ; i++) {
			 w [i] = sc.nextInt();		
		}
		int t1 = 0;
		int t2 = 0 ;
		int k = 0;
		int l = 0;
		
		while(k + l < n  ) {
			if(t1 <= t2) {
				t1 = w[k] + t1;
			k++;}
			
			else {
				t2 = w [n - 1 - l]  + t2;
			l++;
			}
		}
		 int ans = Math.abs(t2-t1);
		 System.out.println(ans);
				
		
		}
	
	 
	
	}


