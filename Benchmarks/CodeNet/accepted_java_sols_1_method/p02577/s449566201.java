import java.util.Scanner;


	public class Main {
		
		

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			char[] num = sc.next().toCharArray();
			int sum = 0;
			
			for(int i=0;i<num.length;i++) {
				int n = num[i]-'0';
				sum += n;
			}
			
			if(sum%9==0) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
	    }
				
	}
	
