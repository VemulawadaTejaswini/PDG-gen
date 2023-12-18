import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			String s = sc.next();
			if(s.compareTo("0")==0)break;
			int a = 0;
			int b = 0;
			String t = "";
			for(int i=1;i<s.length();i++){
				t = s.substring(i,i+1);
				if(t.compareTo("A")==0)a++;
				if(t.compareTo("B")==0)b++;
			}
			if(a>b)a++;
			if(b>a)b++;
			System.out.println(a + " " + b);
		}
		
	}	
}