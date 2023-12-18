import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			StringBuffer s = new StringBuffer(sc.nextLine());
			StringBuffer t = new StringBuffer();
			
			int p = 0;
			for(int i=0;i<27;i++){
				t.delete(0, s.length());
				for(int j=0;j<s.length();j++){
					p = s.codePointAt(j);
					if(p>96 && p<122){
						p+=i;
						if(p>122)p-=26;
					}
					t.append((char)p);
				}
				if(t.indexOf("the ")!=-1 || t.indexOf("the.")!=-1)break;
				if(t.indexOf("that ")!=-1 || t.indexOf("that.")!=-1)break;
				if(t.indexOf("this ")!=-1 || t.indexOf("this.")!=-1)break;
			}
			System.out.println(t);
		}
	}	
}