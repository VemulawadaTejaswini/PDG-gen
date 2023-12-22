import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String origin = sc.next();
		char[] oArray = origin.toCharArray();
		char[] wArray = new char[oArray.length];
		char[] bArray = new char[oArray.length];
			for(int i=0;i<oArray.length;i++) {
				if(i%2==0) {
					wArray[i]='0';
				}else {
					wArray[i]='1';
				}
			}
			for(int i=0;i<oArray.length;i++) {
				if(i%2==0) {
					bArray[i]='1';
				}else {
					bArray[i]='0';
				}
			}
		int wcount=0;
		int bcount=0;
		for(int i=0;i<oArray.length;i++) {
			if(oArray[i]!=wArray[i]) wcount++;
			if(oArray[i]!=bArray[i])bcount++;
		}
		System.out.println(Math.min(wcount,bcount));
	}
}
