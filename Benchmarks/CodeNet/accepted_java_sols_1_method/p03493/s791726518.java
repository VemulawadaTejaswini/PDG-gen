import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String ss[] = new String[3];
		sc.close();

		int count = 0;
		for(int i = 0; i < ss.length; i++) {
			ss[i] = str.substring(i , i + 1);
			if(ss[i].equals("1")) {
				count++;
			}else {
				continue;
			}
		}

		System.out.println(count);
	}
}