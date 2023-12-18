import java.util.Scanner;;
public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a = String.valueOf(N).length();
		int sum = 0;
		
		for(int i=1;i<a;i+=2) {
			sum += 9*Math.pow(10, (double)i-1);
		}
		if(a%2 == 1){
			sum += N - Math.pow(10, (double)a-1) + 1;
		}
		
		System.out.println(sum);
	}
}