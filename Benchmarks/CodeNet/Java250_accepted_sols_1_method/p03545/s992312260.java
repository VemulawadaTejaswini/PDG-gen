import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int[] n = new int[s.length()];
		for(int i = 0; i < s.length(); i++) {
			n[i] = Character.getNumericValue(s.charAt(i));
		}
		
		char[] op = {'-', '+'};
		char[] tempOp = {'-', '-', '-'};
		
		for(int i = 0; i < 1 << 3; i++) {	
			
			for(int j = 0; j < 3; j++) {
				
				if((i >> j & 1) == 1) {
					tempOp[j] = '+';
				}
				
			}
			
			String str = String.valueOf(tempOp);
			int temp = 0;
			switch(str) {
			case "---":
				temp = n[0] - n[1] - n[2] - n[3];
				break;
			case "--+":
				temp = n[0] - n[1] - n[2] + n[3];
				break;
			case "-+-":
				temp = n[0] - n[1] + n[2] - n[3];
				break;
			case "-++":
				temp = n[0] - n[1] + n[2] + n[3];
				break;
			case "+--":
				temp = n[0] + n[1] - n[2] - n[3];
				break;
			case "+-+":
				temp = n[0] + n[1] - n[2] + n[3];
				break;
			case "++-":
				temp = n[0] + n[1] + n[2] - n[3];
				break;
			case "+++":
				temp = n[0] + n[1] + n[2] + n[3];
				break;
			}
			
			if(temp == 7) {
				break;
			}
			
			for(int j = 0; j < 3; j++) {
				tempOp[j] = '-';
			}
			
		}
		
		System.out.println(n[0] + "" + tempOp[0] + "" + n[1] + "" + tempOp[1] + "" + n[2] + "" + tempOp[2] + "" + n[3] + "=" + "7");
		
	}

}
