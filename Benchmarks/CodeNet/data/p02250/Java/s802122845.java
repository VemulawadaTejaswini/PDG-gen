import java.io.IOException;
import java.util.Scanner;
class Main {
  	public static void main(String[] args)throws IOException{
		Scanner scan = new Scanner(System.in);
		String str1 = scan.next();
		int n = scan.nextInt();

		for(int j = 0; j < n; j++){
			String str2 = scan.next();
			int nt = str1.length();
			int np = str2.length();
			boolean check = false;

			if(nt < np) return;

			for(int i = 0; i < nt - np + 1; i++){
				//?????????????????????????????????????????????????????????????????????
				if(str1.charAt(i) == str2.charAt(0) && str1.charAt(i + np - 1) == str2.charAt(np - 1)){
					if(str1.substring(i, np + i).equals(str2)){
						System.out.println("1");
						check =true;
						break;
					}
				}
			}
			if(!check) System.out.println("0");
		}

		return;
	}
}