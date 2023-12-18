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
					str.indexOf("8") >= 0 || str.indexOf("9") >= 0 || str.indexOf("0") >= 0){
				System.out.println("NA");
				continue;
			}
			int a;
			int b;
			char[] ch = str.toCharArray();
			for(int i = 0;i < ch.length;i+=2){
				a = ch[i+1] - '0' -1;
				b = ch[i] - '0' -1;
				if(a > 4 || b > 5 || a < 0 || b < 0){
					System.out.print("NA");
					break;
				}
				System.out.print(m[a][b]);
			}
			System.out.println();
		}
	}
}