import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		char[] ch, ch_;
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int q = scan.nextInt();
		for(int i = 0; i < q; i++){
			String order = scan.next();
			int beg = scan.nextInt();
			int end = scan.nextInt();
			switch(order){
			case "print":
				System.out.println(str.substring(beg, end + 1));
				break;
			case "reverse":
				ch = str.toCharArray();
				ch_ = ch.clone();
				for(int j = beg; j <= end; j++){
					ch[end - (j - beg)] = ch_[j];
				}
				str = new String(ch); //char[]???String?????????
				break;
			case "replace":
				String p = scan.next();
				ch = str.toCharArray();
				ch_ = p.toCharArray();
				for(int j = beg; j <= end; j++){
					ch[j] = ch_[j - beg];
				}
				str = new String(ch); //char[]???String?????????
				break;
			}
		}
		scan.close();
	}
}