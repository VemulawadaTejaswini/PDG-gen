import java.util.*;

class Main {
	public static void main(String[] args){
		final Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		final String lb = System.getProperty("line.separator");
		while(true){
			int num = sc.nextInt();
			int sum = 0;
			if(num == 0) break;
			while(num != 0){
				sum += num % 10;
				num /= 10;
			}
			sb.append(sum).append(lb);	
		}
		System.out.print(sb.toString());
	}
}