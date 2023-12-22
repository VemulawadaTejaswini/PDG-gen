import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] strs = sc.next().split("");

		String[][] signs = new String[(1<<strs.length-1)][strs.length-1];

		for(int i=0; i<signs.length; i++) {
			for(int j=0; j<signs[i].length; j++) {
				signs[i][j] = "-";
			}
		}

		for(int bit=0; bit<(1<<strs.length-1); bit++) {
			for(int i=0; i<strs.length-1; i++) {
				if((1&bit>>i)==1) {
					signs[bit][i] = "+";
				}
			}
		}

		int index = 0;
		for(int i=0; i<signs.length; i++) {
			int result = Integer.parseInt(strs[0]);
			for(int j=0; j<signs[i].length; j++) {
				if(signs[i][j].equals("+")) {
					result += Integer.parseInt(strs[j+1]);
				}else{
					result -= Integer.parseInt(strs[j+1]);
				}
			}
			if(result == 7) {
				index = i;
				break;
			}
		}

		String message = "";
		for(int i=0; i<strs.length-1; i++) {
			message += strs[i] + signs[index][i];
		}

		System.out.println(message + strs[strs.length-1] + "=7");
	}
}