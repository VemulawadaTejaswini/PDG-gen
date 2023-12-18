import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] s = new String[10];
		s[0] = "0111111";
		s[1] = "0000110";
		s[2] = "1011011";
		s[3] = "1001111";
		s[4] = "1100110";
		s[5] = "1101101";
		s[6] = "1111101";
		s[7] = "0100111";
		s[8] = "1111111";
		s[9] = "1101111";
		
		while(true){
			int n = sc.nextInt();
			if(n==-1)break;

			String a = "0000000";
			int t = 0;
			
			for(int i=0;i<n;i++){
				StringBuffer sb = new StringBuffer();
				t = sc.nextInt();
				
				for(int j=0;j<7;j++){
					if(a.codePointAt(j)==s[t].codePointAt(j)){
						sb.append("0");
					}else{
						sb.append("1");
					}
				}
				System.out.println(sb.toString());
				a = s[t];
			}
		}
	}	
}