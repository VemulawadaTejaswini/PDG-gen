public class Main {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		String str = s.next();
		if(str.charAt(0)==str.charAt(3) &&
				str.charAt(1)==str.charAt(2) &&
				str.charAt(0)!=str.charAt(1) ) {
			System.out.println("Yes");
		}else if(str.charAt(0)==str.charAt(2) &&
				str.charAt(1)==str.charAt(3) &&
				str.charAt(0)!=str.charAt(1) ) {
			System.out.println("Yes");
		}else if(str.charAt(0)==str.charAt(1) &&
				str.charAt(2)==str.charAt(3) &&
				str.charAt(1)!=str.charAt(2) ) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}
}
