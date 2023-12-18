import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			String S = sc.nextLine();
			String []s = S.split(" ");
			int l = s.length;
			for(int j = 0; j < l; j++) {
				if(s[j].equals("Hoshino")) {
					s[j] = "Hoshina";
				}
			}
			for(int j = 0; j < l; j++) {
				if(j == l - 1) {
					System.out.println(s[j]);
				}else {
					System.out.print(s[j] +" ");
				}
			}
		}
		sc.close();
	}
}
