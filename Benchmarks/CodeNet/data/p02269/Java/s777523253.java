import java.util.Scanner;
public class Main {
static private Scanner s = new Scanner(System.in);
public static void main(String[] args) {

	int n = s.nextInt();
	int count = 0,fc = 0,a = 0;
	String str;
	String[] dic = new String[n];
	String[] ans = new String[n];
	String sc;
	boolean flag = false;
	StringBuilder sb = new StringBuilder();

	for(int i = 0;i < n;i++) {
		flag = false;
		str = s.next();
		sc = s.next();
		if(str.equals("insert")) {
			dic[count++] = sc;
		}else if(str.equals("find")) {
			fc++;
			for(int j = 0;j < i+1;j++) {
				if(sc.equals(dic[j])) {
				flag = true;
				break;
				}
			}
			if(flag != true) {
				ans[a++] = "no";
			}else {
				ans[a++] = "yes";
			}
		}
	}
	for(int i = 0;i < fc-1;i++) {
		sb.append(ans[i] + "\r\n");
	}
	System.out.println(sb.toString() + ans[fc-1]);
}
}
