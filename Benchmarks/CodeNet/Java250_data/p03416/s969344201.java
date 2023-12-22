import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int answer = 0;
		for(int i = a;i <= b; i++) {
			if(i % 10 ==0) {
				continue;
			}
			String[] hoge = String.valueOf(i).split("");
			if(hoge[0].equals(hoge[4])
					&& hoge[1].equals(hoge[3])){
				answer++;
			}
		}
		System.out.println(answer);
	}

}