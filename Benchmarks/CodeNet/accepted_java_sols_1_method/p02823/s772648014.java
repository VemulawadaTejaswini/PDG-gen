import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong(),a=sc.nextLong(),b=sc.nextLong();
		long count = 0;
		if((b-a)%2!=0) {
			if(a-1<=n-b) {
				count += a;//一番上の卓にいくまでの距離+そこで過ごす1ラウンド
			}else{
				count += n-b+1;//一番下の卓にいくまでの距離+そこで過ごす1ラウンド
			}
            count += (b-a-1)/2;//元々の差分から1ラウンド過ごす分を引いた差分
		    System.out.println(count);
		}else {
			System.out.println((b-a)/2);
		}
	}
}