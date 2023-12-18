import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int N;   //経路数
	int T;   //最大時間

	N = scan.nextInt();
	T = scan.nextInt();

	int[] c = new int[N];   //コスト
	int[] t = new int[N];   //時間

	for(int i = 0; i < N; i++){
	    c[i] = scan.nextInt();
	    t[i] = scan.nextInt();
	}

	int min = 1001;   //最小コスト(初期値は境界の値)

	for(int i = 0; i < N; i++){
	    if(t[i] <= T){
		if(c[i] < min){
		    min = c[i];
		}
	    }
	}

	//最小経路が更新された場合
	if(min < 1001){
	    System.out.println(min);
	}else{
	    System.out.println("TLE");
	}
    }
}
	    
