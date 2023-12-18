import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			String s = sc.next();
			int sum = 0;
			int n = 0;
			int m = 0;
			int t = 0;
			int u = 0;
			for(int i=0;i<s.length();i++){
				n = s.codePointAt(i);
				m = 0;
				u = 0;
				if(i!=s.length()-1)m = s.codePointAt(i+1);
				if(n==73)t = 1;
				else if(n==86)t = 5;
				else if(n==88)t = 10;
				else if(n==76)t = 50;
				else if(n==67)t = 100;
				else if(n==68)t = 500;
				else if(n==77)t = 1000;

				if(m==73)u = 1;
				else if(m==86)u = 5;
				else if(m==88)u = 10;
				else if(m==76)u = 50;
				else if(m==67)u = 100;
				else if(m==68)u = 500;
				else if(m==77)u = 1000;				
							
				if(i==s.length()-1){
					sum += t;
				}else if(u>t){
					sum -= t;
				}else{
					sum += t;
				}
	
			}
			System.out.println(sum);
		}
	
	}	
}