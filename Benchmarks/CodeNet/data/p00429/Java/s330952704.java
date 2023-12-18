import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			if(n==0)break;
			StringBuffer s = new StringBuffer(sc.next());
			
			int count;
			int t = 0;
			StringBuffer u = new StringBuffer();
			for(int k=0;k<n;k++){
				for(int i=0;i<s.length();i++){
					count=1;
					t = s.charAt(i);
					while(i<s.length()-1 && s.charAt(i+1)==t){
						i++;
						count++;
					}
					u.append(count);
					u.append((char)t);
				}
				s = new StringBuffer(u);
				u.delete(0, u.length());
			}
			System.out.println(s);			
			
		}
	}
}