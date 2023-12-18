import java.util.Scanner;
class Main{
	public static void main(String[]agrs){
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int ab = 0;
		int o = 0;
		try {
			String bl = sc.next().split(",")[1];
			if(bl.equals("A")) a++;
			if(bl.equals("B")) b++;
			if(bl.equals("AB")) ab++;
			if(bl.equals("O")) o++;
			System.out.println(a);
			System.out.println(b);
			System.out.println(ab);
			System.out.println(o);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}