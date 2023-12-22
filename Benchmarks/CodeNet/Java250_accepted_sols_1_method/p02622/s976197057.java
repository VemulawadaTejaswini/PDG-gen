import java.util.Scanner;

public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			String S = sc.next();
			String T = sc.next();

			char[] Schar = new char[S.length()];
			char[] Tchar = new char[T.length()];

			for(int i =0; i < Schar.length; i++) {
				Schar[i] = S.charAt(i);
				Tchar[i] = T.charAt(i);
			}
			int count = 0;

			for(int i = 0; i < Schar.length; i++) {
				if(Schar[i]!=Tchar[i] ){
					Tchar[i] = Schar[i];
					count++;
				}
			}

			System.out.print(count);

		}

//	    public static int[] shuffle(int[] nums, int n) {
//
//
//	    	int[] xAray = new int[nums.length];
//	    	int[] yAray = new int[nums.length];
//	    	int[] xyAray = new int[nums.length];
//
//	    	for(int i = 0;i<n;i++) {
//
//	    		xAray[i] = nums[i];
//
//	    	}
//
//	    	for(int i = n;i<nums.length;i++) {
//	    		yAray[i] = nums[i];
//	    	}
//
//	    	for(int i = 0; i<n;i++) {
//	    		if(i == 0) {
//	    			xyAray[i]=xAray[i];
//	    		}if(i %2 == 0 ) {
//	    			xyAray[i] = xAray[i];
//	    		}else if(i % 2 != 0){
//	    			xyAray[i] = yAray[i+n];
//	    		}
//	    	}
//
//	    	return xyAray;
//
//
//	    }
}

