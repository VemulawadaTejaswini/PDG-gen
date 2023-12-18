import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//System.out.println("c");
		
		Scanner sc = new Scanner( System.in );
		int N = sc.nextInt();
		int time = sc.nextInt();
		
		int[] oyu = new int[N];
		
		int oyu_time = 0;
		
		for( int i = 0;i < N;i++ ){
			oyu[i] = sc.nextInt();
			
			if( i == 0 ){
				oyu_time += time;
			}else{
				
				if( oyu[i] - oyu[i - 1 ] > time ){
					oyu_time += time;
				}else{
					oyu_time += time - ( time - ( oyu[i] - oyu[i - 1]) );
				}
				
			}
		}//forここまで
		
		System.out.println(oyu_time);

	}

}
