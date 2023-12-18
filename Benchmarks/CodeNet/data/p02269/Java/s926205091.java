import java.util.Scanner;
import java.util.regex.Pattern;

class Main {
	public static void main (String[] args) {
		Scanner scan = new Scanner (System.in);
		StringBuilder strA = new StringBuilder();
		StringBuilder strC = new StringBuilder();
		StringBuilder strG = new StringBuilder();
		StringBuilder strT = new StringBuilder();
		strA.append(' ');
		strC.append(' ');
		strG.append(' ');
		strT.append(' ');
		
		// 命令数入力
		final int n = scan.nextInt();
		
		for (int i = 0; i < n; i ++) {
			
			//　命令 （insert か find )
			final String ord = scan.next();
			final String word = scan.next();
			
			char c = word.charAt(0);
			
			if (ord.equals("insert")) {
				switch (c) {
				case 'A':
					strA.append(word);
					strA.append(" ");
					break;
				case 'C':
					strC.append(word);
					strC.append(" ");
					break;
				case 'G':
					strG.append(word);
					strG.append(" ");
					break;
				case 'T':
					strT.append(word);
					strT.append(" ");
					break;
				}
				
			} else if (ord.equals("find")){
				String pattern = " " + word + " ";
				Pattern p = Pattern.compile (pattern);
				
				switch (c) {
				case 'A':
					if (p.matcher(strA).find()) {
						System.out.println("yes");
					} else {
						System.out.println("no");
					}
					break;
				case 'C':
					if (p.matcher(strC).find()) {
						System.out.println("yes");
					} else {
						System.out.println("no");
					}
					break;
				case 'G':
					if (p.matcher(strG).find()) {
						System.out.println("yes");
					} else {
						System.out.println("no");
					}
					break;
				case 'T':
					if (p.matcher(strT).find()) {
						System.out.println("yes");
					} else {
						System.out.println("no");
					}
					break;
				}
				
			}
			
		}
		scan.close();
	}
}

