import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = 0;
		String s = ""; 
		while(true) {
		    int sum = 0;
			s = sc.next();
			if(s.equals("0"))break; 
			for(int i = 0; i < s.length(); i++) {
				if (i == (s.length() - 1)) {
					n = Integer.parseInt(s.substring(i));
				} else {
					n = Integer.parseInt(s.substring(i, i + 1));
				}
				sum += n;
			}
			System.out.println(sum);
		}
		
		sc.close();
	}
}
