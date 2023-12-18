import java.util.*;


class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int c1, c2, c3, cnt;
		while(scan.hasNextInt()){
			c1 = scan.nextInt(); c2 = scan.nextInt(); c3 = scan.nextInt();
			cnt = 0;
			for(int i = 1;i <= 10;i++){
				if(i != c1 && i != c2 && i != c3 && 20 - c1 - c2 - i >= 0){
					cnt++;
				}
			}
			if(cnt >= 4){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}

}