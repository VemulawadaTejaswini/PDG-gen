import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//次回のABC
		int N = sc.nextInt();
		//桁数ゾロ目にするため
		int x = N/111;
		//割り切れないとき(670など)は
		//次回ゾロ目の時(777)に参加する
        //670/111=6, 6+1=7, 7*111=777
		if(N%111!=0) {
			x+=1;
		}
		System.out.println(111*x);
	}
}
