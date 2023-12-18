import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int countt = 0;
		int counth = 0;
		
		for(int i = 0; i < n; i++) {
			String taro = sc.next();
			String hanako = sc.next();
			boolean draw = true;
			
			for(int x = 0; x < Math.min(taro.length(), hanako.length()); x++) {
				if(taro.charAt(x) > hanako.charAt(x)) {
					countt += 3;
					draw = false;
					break;
				}else if(taro.charAt(x) < hanako.charAt(x)) {
					counth += 3;
					draw = false;
					break;
				}
			}
			
			if(draw) {
				if(taro.length() > hanako.length()) {
					countt += 3;
				}else if(taro.length() < hanako.length()) {
					counth += 3;
				}else {
					countt++;
					counth++;
				}
			}
		}
		
		System.out.println(countt + " " + counth);
	}
}
