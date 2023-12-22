import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n, judge, taro = 0, hanako = 0;
		String s, s2;
		
		n = sc.nextInt();
		
		for(int i = 0; i < n; i++){
			s = sc.next();
			s2 = sc.next();
			
			judge = s.compareTo(s2);
			
			if(judge < 0)
				hanako += 3;
			else if(judge > 0)
				taro += 3;
			else{
				taro ++;
				hanako ++;
			}
		}
		
		System.out.println(taro + " " + hanako);
	}
}