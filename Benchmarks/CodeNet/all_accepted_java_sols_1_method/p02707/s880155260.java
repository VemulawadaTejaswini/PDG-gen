import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc= new Scanner(System.in);
		
		int N= sc.nextInt();
		int[]member= new int[N+1];
		
		
		
		for(int i=0;i<N-1;i++){
			int x= sc.nextInt();
			member[x]++;
		}
		
		sc.close();
		
		for(int i=1;i<N+1;i++)System.out.println(member[i]);
		
	}

}
