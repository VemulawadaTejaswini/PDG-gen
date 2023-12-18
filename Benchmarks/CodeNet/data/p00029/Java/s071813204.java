import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			String s = sc.nextLine();
			String[] t = new String[501];
			String u;
			int[] a = new int[501];
			int[] b = new int[501];
			int count = 0;
			int start = 0;
			int i = 0;
			int maxlen = 0;
			boolean go = true;			
			
			while(true){
				go = true;
				start = i;
				while(s.codePointAt(i)!=32){
					i++;
					if(i==s.length())break;
				}
				u = s.substring(start, i);
				i++;
				for(int j=0;j<count;j++){
					if(t[j].compareTo(u)==0){
						a[j]++;
						go = false;
						break;
					}
				}
				if(go==true){
					t[count] = u;
					a[count] = 1;
					count++;
					maxlen = Math.max(maxlen, u.length());
				}
				if(i>=s.length())break;
			}
			
			b = Arrays.copyOf(a, 501);
			Arrays.sort(a);
			
			for(int j=0;j<501;j++){
				if(b[j]==a[500]){
					System.out.print(t[j] + " ");
					break;
				}
			}
			for(int j=0;j<501;j++){
				if(t[j].length()==maxlen){
					System.out.println(t[j]);
					break;
				}
			}
			
			
		}
	}	
}