import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int tokuten[] =  new int[N+1];//得点の配列

		for(int i = 0;i<N*(N-1)/2;i++){//Nチームあるときの試合数まで繰り返す
			int a = sc.nextInt();
			int b = sc.nextInt();
			int a1 = sc.nextInt();
		    int b1 = sc.nextInt();
		    
		    if (a1 > b1){//aが勝った場合
		    	tokuten[a] += 3;
		    }else if (a1 < b1){//bが勝った場合
		    tokuten[b] += 3;
		    }else{//同点の場合
		    tokuten[a] += 1;
		    tokuten[b] += 1;
		    }
		}

		for(int i = 1; i < N+1; i++){
			int length = 1;
			for(int j = 0; j < N+1; j++){
				if(tokuten[i] < tokuten[j])
					length += 1;
			}
		    System.out.println(length);
		}
	}
}