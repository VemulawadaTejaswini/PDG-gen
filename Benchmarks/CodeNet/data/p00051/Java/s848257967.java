import java.util.Scanner;
	public class Main{
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			for(int i = 0; i < n ; i++){
				String str = sc.nextLine();
				int get = Integer.parseInt(str);
				int sum = 0;
				for(int j = 8; j > 0; j--){
					sum+=get/10^j-1;
				}
				if(get-sum<0){
					System.out.println(sum-get);
				}else{
					System.out.println(get-sum);
				}
		}	
	}
}