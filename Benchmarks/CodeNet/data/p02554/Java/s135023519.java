import java.util.*;
public class Main {
	static int mod=(int)Math.pow(10,9)+ 7;
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc= new Scanner(System.in);
		
		int n= sc.nextInt();
		sc.close();
		
		if(n < 2) {
			System.out.println(0);
		}
		else{
			int pow= (int)Math.pow(2,n);
			int kaijou=kaijou(n);
		
			int ans= (pow/kaijou)% mod;

			System.out.println(ans);
		}

	}
	
	static int kaijou(int n){
		int res= n;
		
		for(int i=1;i<n;i++){
			res= res*(n-i);
		}
		return res;
		
	}

}
