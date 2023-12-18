import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// 初期化
		int[] list = new int[5];
		int[] check = {9,0,8,7,6,5,4,3,2,1};
		
		Scanner sc = new Scanner(System.in);
		list[0] = sc.nextInt();
		list[1] = sc.nextInt();
		list[2] = sc.nextInt();
		list[3] = sc.nextInt();
		list[4] = sc.nextInt();

		int result=0;
		int cnt=1;
		for(int i=0;i<check.length;i++) {
			for(int j=0;j<list.length;j++) {
				int amari = list[j] % 10;
				if(amari == check[i]) {
					if(cnt!=5) {
						if(amari != 0) {
							result += list[j] + 10 - amari;
						}
						else {
							result += list[j];
						}
					}
					else {
						result += list[j];
					}
					cnt++;
				}	
			}
		}
		System.out.println(result);
	}
}