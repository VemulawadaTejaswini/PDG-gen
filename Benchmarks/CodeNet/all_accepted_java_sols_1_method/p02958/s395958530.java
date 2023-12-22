import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static int nums[] , copys[] ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in) ;
		
		int N = in.nextInt() ;
		
		nums = new int [N] ;
		
		copys = new int [N] ;
		
		for(int i=0;i<N;i++) {
			
			nums[i] = in.nextInt() ;
			
			copys[i] = nums[i] ;
		
		}
		
		Arrays.sort(copys);
		
		int cnt = 0 ;
		
		for(int i=0;i<N;i++) {
			if(copys[i]!=nums[i])
				cnt++ ;
		}
		
		if(cnt>2) {
			System.out.println("NO");
		}else {
			System.out.println("YES");
		}
		
		in.close() ;
	}

}
