import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = 0;
		int n0 = 0;
		String s = sc.next();
		char a[] = new char[s.length() + 1];
		for (int i = 0; i <= s.length() - 1; i++) {
			a[i + 1] = s.charAt(i);
			if (a[i + 1] == '1') {
				n1++;
			}
		}
n0=s.length()-n1;

int an,mi;

if((n0-n1)>0){
	mi=n0-n1;
}else{
	mi=n0-n1;
	mi=0-mi;
}
an=s.length()-mi;
System.out.println(an);
	}
}