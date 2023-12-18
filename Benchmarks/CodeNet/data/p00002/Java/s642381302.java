	import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int n=1;n<=200;n++){
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a+b;
		int k = 0;
		while (c>0){
			if (c>0){
				c = (int)(c/10);
				k = k+1;
			}
		}
		System.out.println(k);
		}
	}

}