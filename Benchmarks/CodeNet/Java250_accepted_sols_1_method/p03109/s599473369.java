import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int a = Integer.parseInt(s.substring(0,4));
		int b = Integer.parseInt(s.substring(5,7));
		int c = Integer.parseInt(s.substring(8,10));
		int ans = a*10000+b*100+c;
		if(ans > 20190430){
			System.out.print("TBD");
		}else{
			System.out.print("Heisei");
		}
		//System.out.print(ans);
	}
}
