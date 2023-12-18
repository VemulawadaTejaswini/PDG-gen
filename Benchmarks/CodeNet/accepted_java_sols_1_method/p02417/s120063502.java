import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		Character objChar1;

		char c;
		int cordchange=97;//??????????????????????????????????????????????????°???
		int total[]=new int[26] ;
		int i=0, num, sum;
		InputStreamReader isr = new InputStreamReader(System.in);
		
		BufferedReader br = new BufferedReader(isr);
		
		do {
			String str = br.readLine();
			if (str == null) {
		        continue;
		    }
		
		for (i = 0; i < str.length(); i++) {
				c = str.charAt(i);
				c=Character.toLowerCase(c);
				if(Character.isLetter(c))
					total[c-cordchange]++;
				
			}
		
		}while (br.ready());
		for(i=0;i<26;i++)
		{
			System.out.println((char)('a'+i)+" : "+total[i]);
		}
}
}