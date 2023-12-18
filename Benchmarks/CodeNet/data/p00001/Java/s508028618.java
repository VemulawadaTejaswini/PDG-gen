	import java.util.Scanner;
public class Main {
	 	public static void main(String[] args) {
	 		Scanner sc = new Scanner(System.in);
	 		int max1 = 0;
	 		int max2 = 0;
	 		int max3 = 0;
	 		for (int n=1;n<=10;n++ ){
	 			int t = sc.nextInt();
	 			if (t>=max1){
	 				max3 = max2;
	 				max2 = max1;
	 				max1 = t;
	 			}else if (t>=max2){
	 				max3 = max2;
	 				max2 = t;
	 			}else if (t>=max3){
	 				max3 = t;
	 			}
	 		}
	 		System.out.println(max1);
	 		System.out.println(max2);
	 		System.out.println(max3);
	 	}
}