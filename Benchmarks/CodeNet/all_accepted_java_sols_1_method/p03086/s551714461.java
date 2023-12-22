import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String S = sc.next();

		int count = 0;
		int maxCount = 0;
		for(int i=0; i<S.length(); i++) {
			String a = S.substring(i,i+1);
			if(a.equals("A") || a.equals("C") ||a.equals("G") ||a.equals("T") ) {
				count++;
			} else {
				count = 0;
			}
			if(maxCount < count) {
				maxCount=count;
			}
		}
		System.out.println(maxCount);

	}
}
