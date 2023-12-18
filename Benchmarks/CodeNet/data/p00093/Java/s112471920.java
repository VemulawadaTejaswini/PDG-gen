import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt(), m = stdIn.nextInt();
		while( n != 0 || m != 0 ){
			List<Integer> list = new ArrayList<Integer>();
			for(int i = n; i <= m; i++){
				if( i%4 == 0 ){
					if( i%100 != 0 || i%400 == 0 ){
						list.add(i);
					}
				}
			}
			if( list.size() == 0 ){
				System.out.println("NA");
			} else {
				for(Integer year : list){
					System.out.println(year);
				}
			}
			System.out.println();
			n = stdIn.nextInt();
			m = stdIn.nextInt();
		}
	}
}