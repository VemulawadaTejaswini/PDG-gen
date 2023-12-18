import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int A = scan.nextInt();
			int B = scan.nextInt();
			int C = scan.nextInt();
			int goukei  = 0;
			
			int []a = {A,B,C};
			
			Arrays.sort(a);//a[2]が一番でかい
			
			if(a[2]%2==0){//偶数
				int x  = 2*(a[1]%2)+a[0]%2;//ぐぐ　０　きぐ　１ぐき２きき３
				
				switch(x){
				case 0:goukei = (a[2]-a[1])/2+(a[2]-a[0])/2;break;//ぐぐ
				case 1:goukei = (a[2]-a[1])/2+(a[2]-a[0])/2+1+1;break;//きぐ
				case 2:goukei = (a[2]-a[1])/2+1+(a[2]-a[0])/2+1;break;//ぐき
				case 3:goukei = (a[2]-a[1])/2+(a[2]-a[0])/2+1;break;//きき
				}	
				System.out.println(goukei);
			}else {//奇数
				int x  = 2*(a[1]%2)+a[0]%2;//ぐぐ　０　きぐ　１ぐき２きき３
				
				switch(x){
				case 0:goukei = (a[2]-a[1])/2+(a[2]-a[0])/2+1;break;//ぐぐ
				case 1:goukei = (a[2]-a[1])/2+1+(a[2]-a[0])/2+1;break;//きぐ
				case 2:goukei = (a[2]-a[1])/2+(a[2]-a[0])/2+1+1;break;//ぐき
				case 3:goukei = (a[2]-a[1])/2+(a[2]-a[0])/2;break;//きき
				}	
				System.out.println(goukei);
				
				
				
			}
			
		}
		
		
	}
		

}