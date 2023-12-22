import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		int ac = 0;
		int wa = 0;
		int tle = 0;
		int re = 0;
		Scanner scan = new Scanner(System.in);
		String array[] = new String[scan.nextInt()];
		for(int i=0;i < array.length;i++) {
			array[i] = scan.next();
			if(array[i].equals("AC")) {
				ac += 1;
			}else if(array[i].equals("WA")) {
				wa += 1;
			}else if(array[i].equals("TLE")) {
				tle += 1;
			}else if(array[i].equals("RE")) {
				re += 1;
			}
		}
		System.out.println("AC x "+ac);
		System.out.println("WA x "+wa);
		System.out.println("TLE x "+tle);
		System.out.println("RE x "+re);

		scan.close();
	}
}