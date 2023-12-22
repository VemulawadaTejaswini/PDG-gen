import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int n = sc.nextInt();
		
		int num = 0;
		int keta = 0;
		
		int n2 = n;
		
		while(n2 > 0) {
			keta++;
			n2 /= 10;
		}
		
		int keta2 = keta;
		
		while(keta > 0) {
			if(keta % 2 == 1) {
				if(keta2 == keta) {
					num = n + 1 - (int)Math.pow(10, keta-1);
				} else {
					num += (int)Math.pow(10, keta-1)*9;
				}
			}
			keta--;
		}
		
		System.out.println(num);
		
        sc.close();
	}
}