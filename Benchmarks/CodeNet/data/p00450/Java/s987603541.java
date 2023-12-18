import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			if(n == 0) break;
			int[] c = new int[n];
			for(int i = 0; i < n; i++) {
				c[i] = sc.nextInt();
			}
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < n; i++) {
				if((i+1) % 2 == 1) {
					sb.insert(i, c[i]);
				}
				else {
					if(sb.charAt(sb.length()-1) - '0' == c[i]) {
						sb.insert(i, c[i]);
					}
					else {
						char tmp = sb.charAt(sb.length()-1);
						sb.deleteCharAt(sb.length()-1);
						int count = 1;
						while(sb.length() != 0 && sb.charAt(sb.length()-1) == tmp) {
							count++;
							sb.deleteCharAt(sb.length()-1);
						}
						for(int j = 0; j < count; j++) {
							sb.append(c[i]);
						}
						sb.append(c[i]);
					}
				}
			}
			int sum = 0;
			//System.out.println(sb.toString());
			for(int i = 0; i < sb.length(); i++) {
				if(sb.charAt(i) - '0' == 0) sum++;
			}
			System.out.println(sum);
			
			
			
		}
		
	}

	
}