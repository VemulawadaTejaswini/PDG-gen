import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < N; i++){
			int hoge = sc.nextInt();
			if (hoge % 2 == 0){
				if (hoge % 3 != 0 && hoge % 5 != 0){
					System.out.println("DENIED");
                  	return;
				}
			}
		}
		System.out.println("APPROVED");
	}
}