import java.util.Scanner;

public class Main {
	
	public static void main( String[]args ){
		
		Scanner sc = new Scanner( System.in );
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] ball_count = new int[n];
		boolean[] red_flag = new boolean[n];
		
		for( int t = 0;t < n;t++ ){
			ball_count[t] = 1;
			if( t == 0 )
				red_flag[0] = true;
			else
				red_flag[t] = false;
		}
		
		
		for( int i = 0;i < m;i++ ){
			int x_i = sc.nextInt();//移動元
			int y_i = sc.nextInt();//移動先
			
			if( red_flag[x_i - 1] )
				red_flag[y_i - 1] = true;
			
			ball_count[x_i - 1] -= 1;
			ball_count[y_i - 1] += 1;
			
			if( ball_count[x_i - 1] == 0 )
				red_flag[x_i - 1 ] = false;
			
		}
		
		int count = 0;
		
		for( boolean a : red_flag ){
			
			if( a )
				count++;
			
		}
		
		System.out.println(count);
		
	}

}