import java.util.*;

class Main {
	public static void main(String[] args){
		final Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		final String lb = System.getProperty("line.separator");
		while(true){
			char[] num = sc.nextLine().toCharArray();
			int sum = 0;
			if(num[0] == '0') break;
			for(int i = 0; i < num.length; i++){
				sum += Integer.parseInt(String.valueOf(num[i]));
			}
			sb.append(sum).append(lb);	
		}
		System.out.print(sb.toString());
	}
}