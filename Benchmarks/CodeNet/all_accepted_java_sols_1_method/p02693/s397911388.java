import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K= sc.nextInt(),A=sc.nextInt(),B=sc.nextInt();
		boolean flag= false;
		for(int i=A;i<B+1;i++) {
			if(i%K==0) {
				flag=true;
			}
		}
		if(flag) {
			System.out.println("OK");
		}else {
			System.out.println("NG");
		}
		

	}

}
