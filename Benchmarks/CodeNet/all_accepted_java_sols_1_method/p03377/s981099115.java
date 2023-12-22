import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//A+Bは0
		//Aは0のみ、Bは0か1(すべて0もしくは1の場合もある)
		//A+Bに0がX個含まれるか判定
		//A+B-X>=0であればYES、そうでなければNO
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = sc.nextInt();

		int evaluation0 = a + b - x;
		int evaluation1 = a - x;
		if(evaluation0 >= 0 && evaluation1 <= 0){
			System.out.println("YES");

		}else{
				
			System.out.println("NO");
		}
		
		
	
	}
}
