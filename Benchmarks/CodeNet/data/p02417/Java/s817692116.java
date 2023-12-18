import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????

		
		// ??\???
		Scanner scan = new Scanner(System.in);
		scan.useDelimiter("\\r\\n");
		
		// ??????
		int X[];
		X = new int[26];
		while(true){
			String s = scan.next();
			// ???????????????
			int sl = s.length();
			if(sl == 0) break;
			
			String s2 = s.toLowerCase();
			char[] charArray = s2.toCharArray();
				
			for (char ch : charArray) {
				int CH = ch;
				//System.out.println("ch " + ch);
				//System.out.println("CH " + (CH-97));
				if(((CH-97)>=0) && ((CH-97)<26)){
					X[CH-97]++;
				}
			}
		}
		
		for (int i=0; i<26; i++) {
			int x = i + 97;
			char a = (char)x;
			System.out.println(a + " : " + X[i]);
		}

		
	}

}