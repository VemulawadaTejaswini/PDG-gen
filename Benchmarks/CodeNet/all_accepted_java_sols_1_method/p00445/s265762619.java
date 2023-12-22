import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> arrayCntJOI = new ArrayList<>();
		List<Integer> arrayCntIOI = new ArrayList<>();
		
		while(sc.hasNext()) {
			String str = sc.next();
			
			char[] charStr = str.toCharArray();

			int cntJOI = 0, cntIOI = 0;
			
			for(int i = 2; i < charStr.length; i++) {
				
				if(String.valueOf(charStr[i - 2] + "" + charStr[i - 1] + "" + charStr[i]).equals("JOI")) {
					cntJOI++;
				}
				
				if(String.valueOf(charStr[i - 2] + "" + charStr[i - 1] + "" + charStr[i]).equals("IOI")) {
					cntIOI++;
				}
			}
			
			arrayCntJOI.add(cntJOI);
			arrayCntIOI.add(cntIOI);
		}
		
		for(int i = 0; i < arrayCntJOI.size(); i++) {
			System.out.println(arrayCntJOI.get(i));
			System.out.println(arrayCntIOI.get(i));
		}
	}
}