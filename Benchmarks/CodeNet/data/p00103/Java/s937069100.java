import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		List<Integer> result = new ArrayList<Integer>();
		
		int n = stdIn.nextInt();
		int count = 0;
		int[] base = new int[4];
		while( n != 0 ){
			String str = stdIn.next();
			if( str.equals("HIT") ){
				base[3] += base[2];
				base[2] = base[1];
				base[1] = base[0];
				base[0] = 1;
			} else if( str.equals("HOMERUN") ){
				base[3] += ( base[2]+base[1]+base[0]+1 );
				base[2] = 0; base[1] = 0; base[0] = 0;
			} else {
				count++;
			}
			if( count == 3 ){
				n--;
				result.add(base[3]);
				base = new int[4];
			}
		}
						
		for(Integer score : result){
			System.out.println(score);
		}
	}
}