import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int city  = sc.nextInt();
		long[] monster = new long[city+1];
		long[] brave = new long[city];
		long anser = 0;
		for(int i=0;i<city+1;i++) {
			monster[i] = sc.nextLong();
		}
		for(int i =0;i<city;i++) {
			brave[i] = sc.nextLong();
		}

		//勇者の攻撃がなくなるまで
		for(int i = 0; i<brave.length;i++) {
			//AとBの小さいほうをanserにいれる
			anser += Math.min(monster[i],brave[i]);
			//A(i+1)と（B-A）の小さいほうを入れる。
			anser += Math.min(monster[i+1],Math.max(brave[i]-monster[i], 0));
			//A(i+1) = A(i+1)とmax(0,(B-A))の小さいほうを引く
			monster[i+1] -= Math.min(monster[i+1],Math.max(brave[i]-monster[i], 0));
		}
		System.out.println(anser);
	}
}