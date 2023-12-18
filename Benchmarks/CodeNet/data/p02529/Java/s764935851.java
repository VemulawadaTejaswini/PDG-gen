import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int S[] = new int [n];
		for(int i = 0; i < n; i++){
			S[i] = sc.nextInt();
		}
		
		int q = sc.nextInt();
		int T[] = new int [q];
		for(int i = 0; i < q; i++){
			T[i] = sc.nextInt();
		}
		
		int count = 0;
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j < q; j++){
				int a = 0;
				if(S[j] == T[i]){
					if(a == 0){
						count++;
					}
					a++;
				}
			}
		}
		System.out.println(count);
		
	}

}