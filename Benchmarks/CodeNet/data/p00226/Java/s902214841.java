//Volume2-0226
import java.util.*;

public class Main {

	public static void main(String[] args) {

		//declare
		String[] s;
		int[]    r,
		         a;
		int      hit,
		         blow;
		
		//input
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			s = sc.nextLine().split("\\s");
			if(s[0].equals("0") && s[1].equals("0")){
				break;
			}
			r = chg(s[0]);
			a = chg(s[1]);

			//initialize
			hit  = 0;
			blow = 0;
			
			//calculate
			for(int i=0;i<r.length;i++){
				for(int j=0;j<a.length;j++){
					if(r[i] == a[j]){
						if  (i == j){hit++; }
						else        {blow++;}
					}
				}
			}
			
			//output
			System.out.println(hit + " " + blow);
		}
	}

	//A string is changed into an integer array.
	private static int[] chg(String s){
		
		int[]  ret = new int[s.length()];
		for(int i=0;i<s.length();i++){
			ret[i] = Integer.valueOf(s.substring(i, i+1));
		}
		return ret;
	}
}