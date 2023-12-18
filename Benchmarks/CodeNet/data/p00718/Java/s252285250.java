import java.util.*;
public class Main {
	Scanner sc;
	void run() { 
		sc = new Scanner(System.in);
		int n= sc.nextInt();
		for (int i=0;i<n;i++) {
			String str1 = sc.next();
			String str2 = sc.next();
			int num = str2Num(str1) + str2Num(str2);
			System.out.println(num2Str(num));
		}
	}
	
	int str2Num(String str) {
		int num=0;
		int tmp=1;
		for (int i=0;i<str.length();i++) {
			String a = "" + str.charAt(i);			
			if (a.compareTo("m")==0) {
				num += tmp * 1000;
				tmp = 1;
			}else if (a.compareTo("c")==0) {
				num += tmp * 100;
				tmp = 1;
			}else if (a.compareTo("x")==0) {
				num += tmp * 10;
				tmp = 1;
			}else if (a.compareTo("i")==0){
				num += tmp;
				tmp = 1;
			}else {
				tmp = Integer.parseInt(a);
			}
		}
		return num;
	}
	
	int[] ku = {1000,100,10,1};
	char[] c = {'m','c','x','i'};
	String num2Str(int num) {
		String str = "";
		for (int i=0;i<4;i++) {
			if (num / ku[i] > 0) {
				int tmp = num/ku[i];
				num = num - tmp*ku[i];
				if (tmp != 1) str += tmp;
				str += c[i];
			}
		}
		return str;
	}
	public static void main(String[] args) {
		new Main().run();
	}
}