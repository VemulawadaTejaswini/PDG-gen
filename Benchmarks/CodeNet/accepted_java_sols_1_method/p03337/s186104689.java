import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int c = A - B;
		int d = A + B;
		int e = A*B;
		int ans = 0;
		if(c > d){
			ans = c;
		}else{
			ans = d;
		}
		if(ans > e){
			System.out.println(ans);
		}else{
			System.out.println(e);
		}
	}
}