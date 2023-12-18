import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			String s = sc.nextLine();
			if(s.compareTo("END OF INPUT")==0)break;
			Scanner sd = new Scanner(s);
			
			String t = "";
			int len = 0;
			while(true){
				t = sd.next();
				System.out.print(t.length());
				len += t.length();
				if(len==s.length())break;
				len++;
			}
			System.out.println();
		}
	}	
}