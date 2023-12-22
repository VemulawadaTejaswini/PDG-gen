import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		boolean flag=false;
exit:	for(int i=0;i<26;i++) {
			for(int j=0;j<15;j++) {
				if(i*4+j*7==N) {
					flag = true;
					break exit;
				}
			}
		}
		if(flag) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}