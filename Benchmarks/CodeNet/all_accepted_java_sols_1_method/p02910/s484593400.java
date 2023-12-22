import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String k = s.next();
		
		int flag=0;
		for(int i=0;i<k.length();i++) {
			if(i%2!=0) {
				if(k.charAt(i)!='L' && k.charAt(i)!='U' && k.charAt(i)!='D') {
					flag=1;
					break;
				}
			}
			else {
				if(k.charAt(i)!='R' && k.charAt(i)!='U' && k.charAt(i)!='D') {
					flag=1;
					break;
				}
			}
		}
		if(flag==0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}
