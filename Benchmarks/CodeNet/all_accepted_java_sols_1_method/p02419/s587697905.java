import java.util.Scanner;
  
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine().toLowerCase();
		int ans = 0;
		while (scan.hasNextLine()) {
			String str2 = scan.nextLine();
			if (str2.equals("END_OF_TEXT")) {
				break;
			}
			String[] str3 = str2.split(" ");
			for (int i = 0, l = str3.length; i < l; i++) {
				String s = str3[i];
				if (s.toLowerCase().equals(str)) {
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
}