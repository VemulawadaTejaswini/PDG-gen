import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long V = sc.nextLong();
		long B = sc.nextLong();
		long W = sc.nextLong();
		long T = sc.nextLong();
		long D = Math.abs(B - A);
		long VDiff = V - W;
		boolean f = true;
		if(VDiff <= 0){
			f = false;
		}else{
			if(VDiff * T >= D){
				f = true;
			}else{
				f = false;
			}
		}
		if(f){
			System.out.println("YES");
		}else{
			System.out.println("NO");			
		}
	}
}
