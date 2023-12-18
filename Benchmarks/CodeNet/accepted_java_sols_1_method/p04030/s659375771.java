import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			String S = sc.next();
			char[] s = S.toCharArray();
			String nS = "";
			List<Integer> a = new ArrayList<Integer>();
			
			for(int i=0;i<S.length();i++) {
				if(s[i]!='B') {
					nS += s[i];
				}else if(!nS.equals("")) {
					nS = nS.substring(0, nS.length()-1);
					
				}
				
			}
			System.out.println(nS);
			
		}

	}
