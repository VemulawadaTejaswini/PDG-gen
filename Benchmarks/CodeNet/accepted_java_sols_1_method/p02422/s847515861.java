import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int q = sc.nextInt();
		
		for(int i = 0; i < q; i++) {
			String command = sc.next();
			
			if(command.equals("print")) {
				int i1 = sc.nextInt();
				int i2 = sc.nextInt();
				
				if(i2 == str.length()-1) {
					System.out.println(str.substring(i1));
				}else {
					System.out.println(str.substring(i1,i2+1));
				}
			}
			
			if(command.equals("reverse")) {
				int i1 = sc.nextInt();
				int i2 = sc.nextInt();
				StringBuilder s = new StringBuilder("");
				
				for(int i3 = i2; i3 >=i1; i3--) {
					s.append(str.charAt(i3));
				}
				str = str.substring(0, i1) + s + str.substring(i2+1);
			}
			
			if(command.equals("replace")) {
				int i1 = sc.nextInt();
				int i2 = sc.nextInt();
				String strr = sc.next();
				
				str = str.substring(0,i1) + strr + str.substring(i2+1);
			}
		}
	}
}
