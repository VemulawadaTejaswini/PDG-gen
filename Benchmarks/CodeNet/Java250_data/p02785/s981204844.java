import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt(); //モンスターの数
		int k=sc.nextInt(); //必殺技の回数

		ArrayList<Long>hp=new ArrayList<>();

		for(int i=0;i<n;i++) {		//モンスターの分,数回す
			hp.add(sc.nextLong()); //モンスターの体力
			//3System.out.println(n);


		}
		Collections.sort(hp);
		Collections.reverse(hp);
		//System.out.println(hp);

		long nomalAttackCount = 0; //通常攻撃の回数
		int roopcounta = 0;//ループが何回回ったかをカウント



		for(int i=0;i<hp.size();i++) {
			roopcounta +=1;
			if(roopcounta>k) {
				long Attack = hp.get(i);
				nomalAttackCount +=Attack;
			}

		}
		//System.out.println(hp.size());
		System.out.println(nomalAttackCount);

	}

}
