import java.util.*;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc= new Scanner(System.in);
		
		int N= sc.nextInt();
		int M= sc.nextInt();
		
		
		int least= N;
		for(int i=0;i<M;i++){
			int A= sc.nextInt();
			least-= A;

			if(A<0)break;
		}
		
		sc.close();
		
		if(least>=0)System.out.println(least);
		else System.out.println(-1);
		
	}

}
