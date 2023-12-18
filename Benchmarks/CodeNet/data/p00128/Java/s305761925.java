import java.util.*;

public class Main{
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		boolean first = true;
		while(sc.hasNext()){
			
			String s = sc.next();
			
			if(first){
				first = false;
			}
			else{
				System.out.println();
			}
			int len = s.length();
			for(int i = 0; i < (5 - len); i++){
				s = "0" + s;
			}
			len = 5;
			char [][] disp = new char[8][5];
			for(int i = 0; i < 8; i++){
				if(i == 2){
					Arrays.fill(disp[i], '=');
				}
				else{
					Arrays.fill(disp[i], '*');
				}
			}
			
			for(int i = 0; i < len; i++){
				int num = s.charAt(i) - '0';
				int ind1 = (num / 5) ^ 1;
				disp[ind1][i] = ' ';
				int ind2 = (num % 5);
				disp[ind2 + 3][i] = ' ';
			}
			
			for(int i = 0; i < 8; i++){
				System.out.println(new String(disp[i]));
			}
			
		}
	}
	private void debug(Object... o) { System.out.println("debug = " + Arrays.deepToString(o)); }

	public static void main(String[] args) {
		new Main().doit();
	}
}