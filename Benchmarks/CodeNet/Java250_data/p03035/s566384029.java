import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		int ans = B;
		if(A<6) {
			ans = 0;
		}else if(A<13){
			ans = B/2;
		}
		System.out.println(ans);
		sc.close();
		
	}
}