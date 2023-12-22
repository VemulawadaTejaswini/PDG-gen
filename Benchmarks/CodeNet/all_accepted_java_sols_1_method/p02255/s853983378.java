import java.util.Scanner;
import java.util.Arrays; //追加

class Main{
    public static void main(String[] args){
	//標準入力
	Scanner scanner = new Scanner(System.in);
	int N = scanner.nextInt();
	int A[] = new int[N];

	String ans; //答え表示用の変数の追加	

	for(int i = 0;i < N; i++){
	    A[i] = scanner.nextInt();
	    
	}
        
	for(int i = 0;i < A.length;i++){
	    int v = A[i];
	    int j = i-1;
	    while(j >= 0 && A[j] > v){
		A[j+1] = A[j];
		j--;
	    };
		A[j+1] = v;
		
		ans = Arrays.toString(A); //文字列に変換する
		ans = ans.replaceAll(",", ""); //","を消去
		ans = ans.replace("[", ""); // "["を消去
		ans = ans.replace("]", ""); // "]"を消去
	    System.out.println(ans);
	}
    }
}

