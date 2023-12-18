import java.util.Scanner;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int M = sc.nextInt();
	// Mの接続状況をビットで管理
	int[] connection = new int[M];
	for(int i = 0; i < M; i++){
	    int k = sc.nextInt();
	    int state = 0;
	    // i番目のビットが立っていたらiとつながっているということになる
	    for(int j = 0; j < k; j++){
		int s = sc.nextInt();
		state += (1 << (s - 1));
	    }
	    connection[i] = state;
	}
	int[] p = new int[M];
	for(int i = 0; i < M; i++){
	    p[i] = sc.nextInt();
	}

	//Check
	int ans = 0;
	for(int i = 0; i < (1 << N); i++){
	    boolean check = true;
	    for(int j = 0; j < M; j++){
		int count = Integer.bitCount(i&connection[j]);
		if(count % 2 != p[j]){
		    check = false;
		    break;
		}
	    }
	    if(check){
		ans++;
	    }
	}
	System.out.println(ans);
	
	
    }
}
