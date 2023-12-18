import java.util.*;

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
		
		long sum=0;
		String dam;
		String str = "";
		
		int alf[];
		char line;
		alf = new int[26];
		
		while(as.hasNextLine()){
			
			str = str + as.nextLine();
			
		}
		
		//line = new char[str.length()];
		
		for(int i=0;i<str.length();i++){      //?????????????????????????????????????´???????
            
            line = str.charAt(i);
            
            alf[line-'a'] += 1;
             
        }
		
		line = 'a';
		
		for(int i=0;i<= 26;i++){
		
			str = (line++)+":"+alf[i];
			System.out.println(str);
			
		}
		
		
		

	}

}