import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		String ss = s.nextLine();
		String t = s.nextLine();
		
		int minS = Integer.MAX_VALUE;
		int tmpS = 0;
		
		for(int i = 0; i + t.length() <= ss.length(); i++) {
			
			String tmp = ss.substring(i, i + t.length());
			tmpS = 0;
			
			for(int j = 0; j < tmp.length(); j++) {
				
				if(tmp.charAt(j) != t.charAt(j))
					tmpS++;
				
			}
			
			if(tmpS < minS)
				minS = tmpS;
			
		}
		
		System.out.println(minS);
		

	}

}
