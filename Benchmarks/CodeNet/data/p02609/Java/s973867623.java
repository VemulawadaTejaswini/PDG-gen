import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		
		
		int n = scan.nextInt();
		String x = scan.next();
		String[] one = x.split("");
		int o = 0;
		
		int[] ans = new int[n];
		
		for(int i = 1; i < n+1; i++) {
			while(true) {
				one[i-1] = String.valueOf(~(Integer.parseInt(one[i-1]))); 
				o = 1;
				for(int j = 0; j < one.length; j++) {
					if(one[j].equals("1")) {
						o++;
					}
				}
				n = n % o;
				System.out.println(n);
				ans[i-1]++;
				if(n == 0) {
					
					break;
				}
				x = Integer.toBinaryString(n);
				one = x.split("");
			}
			
		}
		
		
		for(int i = 0; i < n; i++) {
			System.out.println(ans[i]);
		}
		
	}

}
