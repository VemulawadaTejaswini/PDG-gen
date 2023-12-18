import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			String s = sc.next();
			int[] a = new int[4];
			int p;
			for(int i=0;i<s.length();i++){
				p = s.codePointAt(i);
				if(p==75) a[0]++;
				else if(p==85) a[1]++;
				else if(p==80) a[2]++;
				else if(p==67) a[3]++;
			}
			Arrays.sort(a);
			System.out.println(a[0]);
		}
	}	
}