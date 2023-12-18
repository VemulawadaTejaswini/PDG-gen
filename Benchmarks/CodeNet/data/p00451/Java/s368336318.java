import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			String s = sc.next();
			String t = sc.next();
			if(s.length()>t.length()){
				String u = s;
				s = t;
				t = u;
			}
			char[] a = s.toCharArray();
			char[] b = t.toCharArray();
			int ar = a.length;
			int br = b.length;
			int cr, count;
			int max = 0;
			
			for(int i=0;i<ar+br-2;i++){
				count = 0;
				for(int j=0;j<ar;j++){
					cr = br-1-i+j;
					if(0<=cr && cr<br){
						if(a[j]==b[cr]) count++;
						else{
							max = Math.max(max, count);
							count = 0;
						}
					}
				}
				max = Math.max(max, count);
			}
			System.out.println(max);
		}
	}
}