import java.util.Scanner;

class Main {
	public static void main(String args[]){	
		Scanner scan = new Scanner(System.in);
				
		int n, ap, bp, a;
		String str, str2;
		int str3, str4;
		String str5, sub, sub2;
		
		
		str = scan.next();
		n = scan.nextInt();
		for(int i = 0; i < n; i++){

			str2 = scan.next();
			str3 = scan.nextInt();
			str4 = scan.nextInt();
			
			if(str2.equals("print")){
				if(str4 < str.length() - 1) {
					sub = str.substring(str3, str4 + 1);
				} else {
					sub = str.substring(str3);
				}
				
				System.out.println(sub);
				
			} else if(str2.equals("reverse")){
				if(str3 != 0) {
					sub = str.substring(0, str3);
				} else {
					sub = "";
				}
				if(str4 < str.length() - 1) {
					sub2 = str.substring(str4 + 1);
				} else {
					sub2 = "";
				}
				
				String sub3 = str.substring(str3, str4 + 1) ;
				
				StringBuffer sb = new StringBuffer(sub3);
				str = sub + sb.reverse().toString() + sub2;
				
			} else if(str2.equals("replace")) {
				sub = str.substring(0, str3);
				
				if(str4 < str.length() - 1) {
					sub2 = str.substring(str4 + 1);
				} else {
					sub2 = "";
				}
				
				str5 = scan.next();
				str = sub + str5 + sub2;
			}
		}
	}
	
}