import java.io.IOException;
import java.util.Scanner;

public class Practice01_01 {
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		int ac = 0;
		int wa = 0;
		int tle = 0;
		int re = 0;
		int cnt = scan.nextInt();
		String result[] =new String[cnt];
		for(int i = 0; i <= cnt-1;i++) {
			result[i] = scan.next();
		}
		for(int i = 0;i < result.length;i++) {
			if(result[i].equals("AC")) {
				ac += 1;
			}else if(result[i].equals("WA")) {
				wa += 1;
			}else if(result[i].equals("TLE")) {
				tle += 1;
			}else if(result[i].equals("RE")) {
				re += 1;
			}
		}
		System.out.println("AC × "+ac);
		System.out.println("WA × "+wa);
		System.out.println("TLE × "+tle);
		System.out.println("RE × "+re);
	}
}