import java.util.Scanner;

public class Main {
	
	public static void main( String[]args ){
		
		Scanner sc = new Scanner( System.in );
		
		int n = sc.nextInt();
		int l = sc.nextInt();
		
		int[] number = new int[ n ];
		 
		int p_number = 0;//ロープのほどく可能ナンバー
		boolean l_flag = false; // ここがfalseだったらほどけないということ
		for( int i = 0;i < n;i++ ){
			
			number[i] = sc.nextInt();
			if( i == 0 && !l_flag ){
				if( number[i] == l ){
					l_flag = true;
					p_number = i;
				}
			}else if( !l_flag ){
				
				if( l > (number[i - 1] + number[i]) )
					l_flag = false;
				else{
					l_flag = true;
					p_number = i;
				}
			}
		}
		
		if( l_flag ){
			System.out.println("Possible");
			
				for( int i = n - 1;i > p_number;i-- )
					System.out.println(i);
				for( int i = 1;i <= p_number;i++ )
					System.out.println(i);
		
		}else{
			System.out.println("Impossible");
		}
		
	}

}