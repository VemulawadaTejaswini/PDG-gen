import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


	    //入力数字の数を入力
		Scanner sc=new Scanner(System.in);
		long countvalue=(long)Math.pow(10, 15);
		
		int count=sc.nextInt();
		if(count>=2&&count<=countvalue) {
			
		
	    long[] nyuryoku = new long[count];
	    long datavalue=(long)Math.pow(10, 18);
	    //入力処理
		for(int i=0;i<count;i++) {
				nyuryoku[i]=sc.nextLong();
		
		
		

		long result=0;
		long max=(long)Math.pow(10, 18);
		

		//乗算結果処理
		for(int j=0;j<count;j++) {
			if(nyuryoku[i]>=2&&nyuryoku[i]<=datavalue) {
			if(result==0) {
				result+=nyuryoku[j];
			}else 
				
				result*=nyuryoku[j];
			}
		}
		
		
		
		if(result>max) {
			  System.out.println(-1);
			}else if(nyuryoku.length==count-1) {
				
		      System.out.println(result);
			}
		  
		}
    } 
 }
}