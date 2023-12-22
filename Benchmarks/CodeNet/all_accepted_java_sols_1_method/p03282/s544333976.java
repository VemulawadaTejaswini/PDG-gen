import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] S = sc.nextLine().toCharArray();
		long K = sc.nextLong();
		sc.close();
		char a = '1';
		for(int i=0;i<K;i++){
			if(i >= S.length) break;
			if(S[i] != '1'){
				a = S[i];
				break;
			}
		}
		System.out.println(a);

	}

}