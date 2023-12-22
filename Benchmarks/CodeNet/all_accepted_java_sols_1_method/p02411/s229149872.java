
import java.util.*;

class Main {
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		//中間試験m、期末試験f、再試験rの点数を受け取る
		while(true){
			String s1 = sc.next();
			int m = Integer.parseInt(s1);
			String s2 = sc.next();
			int f = Integer.parseInt(s2);
			String s3 = sc.next();
			int r = Integer.parseInt(s3);
			//全て-1が入力されたときプログラムを終了する
			if(m == -1 && f == -1){
				if(r == -1){
					break;
				}
			}
			//中間、期末のどちらか休んだ場合はFと表示
			if(m == -1 || f == -1){
				System.out.println("F");
			}
			//80点以上はA
			else if(80 <= m + f){
				System.out.println("A");
			}
			//65点以上はB
			else if(65 <= m + f && m + f < 80){
				System.out.println("B");
			}
			//50点以上はC
			else if(50 <= m + f && m + f < 65){
				System.out.println("C");
			}
			//30点以上はD（ただし再試験が50点以上ならC）
			else if(30 <= m + f && m + f < 50){
				if(50 <= r){
					System.out.println("C");
				}
				else{
					System.out.println("D");
				}
			}
			//30点未満はF
			else{
				System.out.println("F");
			}
		}
	}

}