import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		char[] ch= sc.next().toCharArray();
		sc.close();

		for(int i = 0;i < ch.length;i++){
			ch[i] += N;
			if(ch[i] > 'Z'){
				ch[i] -= 26;
			}
			System.out.print(ch[i]);
		}
	}
}