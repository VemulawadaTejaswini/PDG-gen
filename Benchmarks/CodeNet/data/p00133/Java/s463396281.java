import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		char[][] ch = new char[8][8];
		Scanner sc = new Scanner(System.in);
		String str;
		for(int i=0;i<8;i++){
			str = sc.next();
			for(int j=0;j<8;j++){
				ch[i][j] = str.charAt(j);
			}
		}
		
		System.out.println(90);
		for(int i=7;i>=0;i--){
			for(int j=0;j<8;j++){
				System.out.print(ch[i][j]);
			}
			System.out.println();
		}
		
		System.out.println(180);
		for(int i=7;i>=0;i--){
			for(int j=7;j>=0;j--){
				System.out.print(ch[i][j]);
			}
			System.out.println();
		}
		
		System.out.println(270);
		for(int i=0;i<8;i++){
			for(int j=7;j>=0;j--){
				System.out.print(ch[i][j]);
			}
			System.out.println();
		}
	}
}