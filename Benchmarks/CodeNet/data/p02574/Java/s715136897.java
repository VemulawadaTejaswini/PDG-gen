import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] A = new int[N];
		A[0] = sc.nextInt();
		A[1] = sc.nextInt();
		int cgcd = gcd(A[0],A[1]);
		boolean setwiseflg = false;
		for(int i=2;i<N;i++) {
			A[i] = sc.nextInt();
			if(cgcd != 1) {
				cgcd = gcd(cgcd,A[i]);
			}
			for(int j=0;j<i;j++) {
				if(gcd(A[j],A[i])!=1&&setwiseflg==false) {
					setwiseflg = true;
					break;
				}
			}
		}
		if(cgcd != 1) {
			System.out.println("not coprime");
		} else {
			if(setwiseflg) {
				System.out.println("setwise coprime");
			} else {
				System.out.println("pairwise coprime");
			}
		}
	}
    public static int gcd(int num1,int num2) {
        if(num2==0) return num1;
        else return gcd(num2,num1%num2);
    }
}