import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new java.util.Scanner(System.in);
		String S = in.nextLine();
		//int N = in.nextInt();
		int num = 0;
		for(int i=0; i<4; i++) {
			if(S.substring(i, i+1).equals("+")) {
				num++;
			}else {
				num--;
			}
		}
		System.out.print(num);
		in.close();
		
	}
}