import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] c = new String[]{
				"100101","10011010","0101","0001","110",
				"01001","10011011","010000","0111","10011000",
				"0110","00100","10011001","10011110","00101",
				"111","10011111","1000","00110","00111",
				"10011100","10011101","000010","10010010","10010011","10010000"
		};
		
		
		while(sc.hasNext()){
			StringBuffer sb = new StringBuffer();
			StringBuffer ans = new StringBuffer();
			String s = sc.nextLine();
			
			int p, q;
			for(int i=0;i<s.length();i++){
				p = s.codePointAt(i);
				if(p>=65 && p<=90) sb.append(c[p-65]);
				else if(p==32) sb.append("101");
				else if(p==39) sb.append("000000");
				else if(p==44) sb.append("000011");
				else if(p==45) sb.append("10010001");
				else if(p==46) sb.append("010001");
				else if(p==63) sb.append("000001");
			}
			
			p = sb.length()%5;
			if(p!=0){
				for(int i=0;i<5-p;i++) sb.append("0");
			}
			
			for(int i=0;i<sb.length();i+=5){
				p = 0;
				q = 16;
				for(int j=0;j<5;j++){
					p += (sb.codePointAt(i+j)-48)*q;
					q /= 2;
				}
				if(p<=25) ans.append((char)(p+65));
				else if(p==26) ans.append(" ");
				else if(p==27) ans.append(".");
				else if(p==28) ans.append(",");
				else if(p==29) ans.append("-");
				else if(p==30) ans.append("'");
				else if(p==31) ans.append("?");
			}
	
			System.out.println(ans);
		}
	}
}