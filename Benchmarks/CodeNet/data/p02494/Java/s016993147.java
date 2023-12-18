public class Main {
	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		while(true) {
			String str1 = in.next();
			String str2 = in.next();
			int h = java.lang.Integer.parseInt(str1);
			int w = java.lang.Integer.parseInt(str2);
			if(h == 0 && w == 0) break;
			for(int i = 0; i < h; i++) {
				for(int j = 0; j < w; j++) {
					System.out.print("#");
				}
				System.out.println("");
			}
		}
	}
}