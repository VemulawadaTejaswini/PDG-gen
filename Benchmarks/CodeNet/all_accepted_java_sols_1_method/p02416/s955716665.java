import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String[] scan_str = new String[1000];
		String str = null;
		int i = 0;
		int res;
		// str.length分ループして足し算
		while(true){
			res = 0;
			str = scan.nextLine();
			if("0".equals(str)){
				break;
			}
			scan_str = str.split("");
			for(i=0; i<str.length(); i++){
				res = res + Integer.parseInt(scan_str[i]);
			}
			System.out.println(res);
		}
	}
}
