import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			String s = sc.next();
			int n = sc.nextInt();
			int count = 0;
			for(int i=0;i<n;i++){
				String t = sc.next();
				t = t+t;
				if(t.indexOf(s)!=-1) count++;
			}
			System.out.println(count);
		}
	}	
}