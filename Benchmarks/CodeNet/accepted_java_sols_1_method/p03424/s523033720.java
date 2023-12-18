import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 個数を取得
		Integer n = sc.nextInt();
		for(int i = 0; i < n ; i++){
			String color = sc.next();
			if("Y".equals(color)){
				System.out.println("Four");
				break;
			}else if(i == n-1){
				System.out.println("Three");
			}
		}
	}
}