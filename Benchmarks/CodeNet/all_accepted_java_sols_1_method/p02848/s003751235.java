	import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			int num = sc.nextInt();
			String s = sc.next();

			char [] c = new char[s.length()];

			for(int i =0;i<s.length();i++) {
				c[i]=s.charAt(i);
			}

			String start = "A";
			String end = "Z";

			for(int i =0;i<c.length;i++) {
				for(int j=0;j<num;j++){
					if(c[i] == end.charAt(0)){
						c[i] = start.charAt(0);
					}else {
						c[i]++;
					}

				}

			}

			for(int i=0;i<c.length;i++) {
				System.out.print(c[i]);
			}
	}
}


