import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		// 整数の入力
		double a = sc.nextInt();
		double b = sc.nextInt();
		double x = sc.nextInt();
		
		
		//String s = sc.next();

		//String[] ss = s.split("");

		//int[] a = new int[n];
		
		x= x/a;
		double ans = 0;
		
		
		if(x>a*b/2) {
			double s = b- (x-a*b/2)*2/a;
			ans = Math.atan(s/a);
		}else {
			double t = 2*x/b;
			ans = Math.atan(b/t);
		}

		System.out.println(ans*180/Math.PI);

		/*
		TreeMap<Integer,Integer> treeMap = new TreeMap<>();//sorted no duplication
		treeMap.put(b[n], n);
		*/

	}

}
/*
class City{
	int order;
	int prefecture;
	int year;
	int number;
	City(int order,int prefecture, int year){
		this.order = order;
		this.prefecture = prefecture;
		this.year = year;
	}
}
*/
