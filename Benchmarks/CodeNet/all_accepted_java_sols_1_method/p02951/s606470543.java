import java.util.*;
public class Main{
static int A= 0;
static int B= 0;
static int C= 0;
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		A=sc.nextInt();
		B=sc.nextInt();
		C=sc.nextInt();
		int t=A-B;
		int ans =C-t;
		if(ans<0) {
			System.out.println("0");
		}else {
		System.out.println(ans);
		}

}
}
