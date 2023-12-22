import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long k = sc.nextLong();
		long d = sc.nextLong();
		sc.close();

		long count;
		if(x>=0) {
			count = x/d;
		}else {
			count = -1*x/d;
		}

		boolean flag = false;
		long zanCount;
		if(count<=k) {
			zanCount = k - count;
		}else {
			zanCount = k;
			count=0L;
			flag = true;
		}

		long zanX;
		if(count==0) {
			zanX = x;
		}else {
			if(x>=0) {
				zanX = x - count*d;
			}else {
				zanX = x + count*d;
			}
		}

		//答え
		if(flag) {
			if(x>=0) {
				zanX = x - k*d;
			}else {
				zanX = x + k*d;
			}
			if(zanX<0) {
				zanX = -1L*zanX;
			}
			System.out.println(zanX);
			return;
		}


		if(zanCount%2==0) {
			if(zanX<0) {
				zanX = -1L*zanX;
			}
			System.out.println(zanX);
		}else {
			long aa = zanX-d;
			long bb = zanX+d;

			if(aa<0) {
				aa = -1L*aa;
			}
			if(bb<0) {
				bb = -1L*bb;
			}

			if(aa<=bb) {
				zanX = aa;
			}else {
				zanX = bb;
			}
			System.out.println(zanX);
		}




	}
}