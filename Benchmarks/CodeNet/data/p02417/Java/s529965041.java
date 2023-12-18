import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	
	public static void main(String[] args) throws IOException {
		int p;
		int i=0;
   	    InputStreamReader reader=new InputStreamReader(System.in);
		int count[] = new int[26];
		char c[]=new char[1200];
		for(;;) {
			c[i]=(char) reader.read();
			if(c[i]=='.') {
				break;
			}
	        //System.out.println(c[i]);
			i++;
		}
	    
		for(i=0;i<c.length;i++) {
			if(c[i]>='A'&&c[i]<='Z') {
				c[i]+=32;
			}else if(c[i]>='a'&&c[i]<='z') {
				
			}else {
				continue;
			}
			p= c[i]-'a';
			count[p]++;
		}
		for(i=0;i<26;i++) {
			System.out.printf("%c:%d\n",i+'a',count[i]);
		}
		System.out.print("\n");	
	}
	
}
