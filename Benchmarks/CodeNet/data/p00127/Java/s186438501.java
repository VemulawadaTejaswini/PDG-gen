import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		char[][] m = new char[5][6];
		int t = 97;
		for(int i = 0;i < 6;i++){
			for(int j = 0;j < 5;j++){
				m[j][i] = (char)t;
				t++;
			}
		}
		m[1][5] = '.';
		m[2][5] = '?';
		m[3][5] = '!';
		m[4][5] = ' ';
		while(scan.hasNext()){
			String str = scan.nextLine();
			if(str.length() % 2 != 0 || str.indexOf("7") >= 0 ||
					str.indexOf("8") >= 0 || str.indexOf("9") >= 0){
				System.out.println("NA");
				continue;
			}
			for(int i = 0;i < str.length()-1;i+=2){
				System.out.print(m[Integer.parseInt(str.charAt(i+1)+"")-1][Integer.parseInt(str.charAt(i)+"")-1]);
			}
			System.out.println();
		}
	}
}