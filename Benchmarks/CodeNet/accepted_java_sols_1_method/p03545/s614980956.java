import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] ch = sc.next().toCharArray();
		sc.close();
		int A = Integer.parseInt(String.valueOf(ch[0]));
		int B = Integer.parseInt(String.valueOf(ch[1]));
		int C = Integer.parseInt(String.valueOf(ch[2]));
		int D = Integer.parseInt(String.valueOf(ch[3]));
		char[] op = {'+','-'};
		int sum = 0;
		for(int i = 0;i < op.length;i++) {
			for(int j = 0;j < op.length;j++) {
				for(int k = 0;k < op.length;k++) {
					if(op[i]=='+') {
						sum += A+B;
					}else {
						sum += A-B;
					}
					if(op[j]=='+') {
						sum += C;
					}else {
						sum -= C;
					}
					if(op[k]=='+') {
						sum += D;
					}else {
						sum -=D;
					}
					if(sum==7) {
						System.out.println(A+String.valueOf(op[i])
								+B+String.valueOf(op[j])
								+C+String.valueOf(op[k])
								+D+"=7");
						return;
					}
					sum=0;
				}
			}
		}
	}
}