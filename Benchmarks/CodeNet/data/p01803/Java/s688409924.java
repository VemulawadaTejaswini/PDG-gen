import java.util.*;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			
			int max = 0;
			String[] codes = new String[n];
			for(int i=0;i<n;i++){
				String s = sc.next();
				codes[i] = "" + s.charAt(0);
				for(int j=0;j<s.length()-1;j++){
					char c = s.charAt(j);
					if(c=='a' || c=='i' || c=='u' || c=='e' || c=='o') codes[i] += s.charAt(j+1);
				}
				max = Math.max(max, codes[i].length());
			}
			
			String ans = "-1";
			for(int i=1;i<=max;i++){
				ArrayList<String> list = new ArrayList<String>();
				for(int j=0;j<n;j++){
					String s = codes[j];
					if(i<codes[j].length())	s = codes[j].substring(0, i);
					if(list.contains(s)) break;
					else list.add(s);
				}
				if(list.size()==n){
					ans = Integer.toString(i);
					break;
				}
			}
			
			System.out.println(ans);
		}
	}
}