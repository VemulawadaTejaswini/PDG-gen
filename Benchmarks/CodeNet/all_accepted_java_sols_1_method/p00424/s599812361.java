//Volume5-0501
import java.util.*;

class Main {
	
	//declare
	private static HashMap<Character,Character> map = new HashMap<Character,Character>();
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int  n,m;
		char c,r;
		while((n=sc.nextInt())!=0){
			map.clear();
			while(n-- > 0){
				map.put(sc.next().charAt(0),sc.next().charAt(0));
			}
			m=sc.nextInt();
			while(m-- > 0){
				c=sc.next().charAt(0);
				if   (map.containsKey(c)){r=map.get(c);}
				else                     {r=c;         }
				System.out.print(r);
			}
			System.out.println();
		}
	}
}