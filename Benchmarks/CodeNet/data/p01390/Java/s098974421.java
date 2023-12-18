import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("?a");
		ArrayList<String> list = new ArrayList<String>();
		while(true){
			String s = sc.next();
			if(list.contains(s)==true || s.length()==1 || s.charAt(0)!='a'){
				System.out.println("!OUT");
				break;
			}
			list.add(s);
			s = s.substring(1,2);
			if(s.compareTo("a")==0) s = "aa";
			System.out.println("?" + s + "a");
		}	
	}	
}