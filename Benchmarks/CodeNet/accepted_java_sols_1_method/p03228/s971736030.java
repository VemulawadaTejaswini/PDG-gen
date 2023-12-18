import java.util.*;
import java.math.*;
import java.lang.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int k = sc.nextInt();
		boolean turnA = true;

		for(int i=0;i<k;i++){
			if(turnA){
				if(a%2==1){
					a-=1;
				}
				b = b+ a/2;
				a = a/2;
				turnA =false;
				// System.out.println(a + " "+b);
			}else{
				if(b%2==1){
					b-=1;
				}
				a = a+ b/2;
				b = b/2;
				turnA =true;
				// System.out.println(a + " "+b);
			}
		}
		System.out.println(a + " "+b);

	}
}