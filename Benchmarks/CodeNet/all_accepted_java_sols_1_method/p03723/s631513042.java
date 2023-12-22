import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		sc.close();
		long[] array = {a,b,c};

		if(a%2!=0||b%2!=0||c%2!=0){
			System.out.println(0);
			return;
		}

		if(a==b&&b==c){
			System.out.println(-1);
			return;
		}

		long ans = 1L;

		while(true) {
			long aa = array[0]/2L;
			long bb = array[1]/2L;
			long cc = array[2]/2L;

			array[0]= bb+cc;
			array[1]= aa+cc;
			array[2]= aa+bb;
			if(array[0]%2==0&&array[1]%2==0&&array[2]%2==0) {
				ans++;
			}else {
				System.out.println(ans);
				return;
			}
		}
	}
}