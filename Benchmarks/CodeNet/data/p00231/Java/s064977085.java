//Volume2-0231
import java.util.*;

class Token implements Comparable<Token>{
	public  int ope;
	public  int weight;
	private int time;
	Token(int o,int m,int t){
		this.ope=o; this.weight=m; this.time=t;
	}
	public int compareTo(Token t){
		int ret;
		ret = this.time - t.time;
		if(ret==0){
			ret = this.ope - t.ope;
		}
		return ret;
	}
}

class Main {
	
	//declare
	private static ArrayList<Token> ar = new ArrayList<Token>();
	
	public static void main(String[] args){
		
		int    n,m,sum;
		String result;
		
		//input
		Scanner sc = new Scanner(System.in);
		while((n=sc.nextInt())!=0){
			ar.clear();
			while(n-- > 0){
				m = sc.nextInt();
				ar.add(new Token( 1,m,sc.nextInt()));
				ar.add(new Token(-1,m,sc.nextInt()));
			}
			
			//calculate			
			Collections.sort(ar);
			sum=0; result="OK";
			for(Token t:ar){
				sum += t.weight * t.ope;
				if(sum>150){
					result="NG";
					break;
				}
			}
			//output
			System.out.println(result);
		}
	}
}