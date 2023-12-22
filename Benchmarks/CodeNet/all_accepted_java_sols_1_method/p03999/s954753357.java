import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		in.close();
		int n = s.length()-1;
		long result = 0;

		for (int i=0; i<(Math.pow(2,n)); i++) {
			String str= s;
			for (int j=n; 0<j; j--) {
				if ((1&i>>j-1) == 1) {
					str = str.substring(0,j) + "," + str.substring(j,str.length());
				}
			}
			String[] ary = str.split(",");
			for(String ch: ary){
				result = result + Long.parseLong(ch);
			}
		}
		System.out.println(result);
	}
}
