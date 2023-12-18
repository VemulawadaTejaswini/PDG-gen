import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int[] heights = new int[10];
		int hi = 0;
		int me = 0;
		int low = 0;
		for(int i = 0; i < heights.length; i++){
			int height = s.nextInt();
			if(height >= hi){
				low = me;
				me = hi;
				hi = height;
			}
			if(height >= me && height < hi){
				low = me;
				me = height;
			}
			if(height >= low && height < me){
				low = height;
			}
		}
		System.out.println(hi);
		System.out.println(me);
		System.out.println(low);
		
	}
}