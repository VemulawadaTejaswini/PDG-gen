import java.util.Scanner;

/**
 * @author kawakami
 *
 */
class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner as = new Scanner(System.in);
		
		String str,copy,dam;
		String chg = "";
		
		str = as.nextLine();
		char line[];
		char hika[];
		line = new char[str.length()];
		hika = new char[str.length()];
		
		copy = str;
		copy = copy.toLowerCase();
		
		for(int i=0;i<str.length();i++){
			
			line[i] = str.charAt(i);
			hika[i] = copy.charAt(i);
			
			
		}
		
		for(int i=0;i<str.length();i++){
			
			if(line[i] != hika[i]){
				
				dam = String.valueOf(line[i]);
				dam = dam.toLowerCase();
				chg = chg + dam;
				
			}
			else{
				
				dam = String.valueOf(line[i]);
				dam = dam.toUpperCase();
				chg = chg + dam;
				
			}
			
			
			
		}
		
		System.out.println(chg);

	}

}