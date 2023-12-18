import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			String s = sc.next();

			String[] a = new String[s.length()];

			for(int i =0;i<s.length();i++) {
				a[i]=String.valueOf(s.charAt(i));

			}


			long res = 0;
			long b =0;


			for(int i=0;i<s.length();i++) {
				if(a[i].equals("B")) {
					b++;
				}
				if(a[i].equals("W")) {
					res=res+b;
				}


			}

			System.out.println(res);

		}

	}