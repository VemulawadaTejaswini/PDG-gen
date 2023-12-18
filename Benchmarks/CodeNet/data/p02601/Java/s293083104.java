import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int K = sc.nextInt();
		sc.close();
		for(int i=0;i<K;++i){
			if(A >= B){
				B *= 2;
			}else{
				C *= 2;
			}
			System.out.println(A+" "+B+" "+C);
		}
		if(B > A && C > B){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}

