
import java.util.Scanner;
//
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
		int a=sc.nextInt();
		int b=sc.nextInt();
		String a_st =String.valueOf(a);
		String b_st =String.valueOf(b);
		for (int i=0;i<b-1;i++) {
			a_st +=String.valueOf(a);
		}
		for (int i=0;i<a-1;i++) {
			b_st +=String.valueOf(b);
		}
		if (a_st.compareTo(b_st)<=0) {
			System.out.println(a_st);
		} else{
			System.out.println(b_st);
		}
		
		//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
	}
	//----------------------------------------
	//メソッド置き場

	//----------------------------------------
}