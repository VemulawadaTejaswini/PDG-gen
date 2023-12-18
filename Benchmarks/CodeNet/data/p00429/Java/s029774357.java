import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			if(n==0)break;
			String s = sc.next();
			
			int count;
			String t = "";
			String u = "";
			for(int k=0;k<n;k++){
				for(int i=0;i<s.length();i++){
					count=1;
					t = s.substring(i,i+1);
					while(i<s.length()-1 && s.substring(i+1,i+2).compareTo(t)==0){
						i++;
						count++;
					}
					u += Integer.toString(count) + t;
				}
				s = u;
				u = "";
			}
			System.out.println(s);			
			
		}
	}
}