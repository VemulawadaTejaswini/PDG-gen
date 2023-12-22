import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String[] s = stdIn.next().split("");
		boolean flag = true;
		
		
		if(!s[0].equals("A")) {
			flag = false;
		}
		int cnt = 0;
		int tmp = 0;
		for(int i = 2; i < s.length-1; i++) {
			if(s[i].equals("C")) {
				cnt++;
				tmp = i;
			}
		}
		
		if(cnt != 1) {
			flag = false;
		}
		
		for(int i = 1; i < s.length; i++) {
			if(i == tmp) {
				continue;
			}else {
				if(!Character.isLowerCase(s[i].charAt(0))){
					flag = false;
				}
			}
			
		}
			if(flag) {
				System.out.println("AC");
			}else {
				System.out.println("WA");
			}
		
	}

}
