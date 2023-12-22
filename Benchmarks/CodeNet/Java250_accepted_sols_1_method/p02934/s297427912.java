import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a =    sc.nextInt();
		double num = 0;
		for(int i = 0; i < a;i++) {
			int b =    sc.nextInt();
			num += 1.0 /b;
		}
		 num = 1.0 / num;  
       System.out.println(num);
	}
}