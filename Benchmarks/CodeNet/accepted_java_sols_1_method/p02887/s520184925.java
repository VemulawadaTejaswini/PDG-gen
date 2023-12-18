
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = Integer.parseInt(scan.nextLine());
			String str = scan.nextLine();
			char[] cs =new char[n];
			cs=str.toCharArray();
			StringBuilder stb =new StringBuilder();
			stb.append(cs[0]);
			for(int i=1;i<cs.length;i++){
				if(cs[i]==stb.charAt(stb.length()-1))
					continue;
				else
					stb.append(cs[i]);
			}
			System.out.println(stb.length());
		}
	}
}
