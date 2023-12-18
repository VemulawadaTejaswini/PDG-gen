import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		char []strtochar = str.toCharArray();
		int count = 0;
		
		for(char c: strtochar) {
		    
		    if (Character.isLetter(c)){
		        
		        if (Character.isUpperCase(c)){
    		        System.out.print(Character.toLowerCase(c));
    		    }else {
    		        System.out.print(Character.toUpperCase(c));
    		    }
    		    
		    }else {
		        System.out.print(c);
		    }
		}
		
		System.out.println();
	}

}
