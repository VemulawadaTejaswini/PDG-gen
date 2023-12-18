import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		int result =1;
		for(int i=m/n;i>1;i--){
			int amari =m-i*n;
			// System.out.print("今は"+i);
			// System.out.println("amari"+amari);
			if(amari==0||amari%i==0){
				result = i;
				break;
			}
			// System.out.println("result"+result);
		}
		System.out.println(result);
		// System.out.println(result);
	}
}