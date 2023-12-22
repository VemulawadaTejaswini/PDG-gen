    import java.util.*;
    public class Main {
    	public static void main(String[] args){
    		Scanner sc = new Scanner(System.in);
    		// 食べた数の入力
    		int N = sc.nextInt();
		//払った金額
		int x=N*800;
		//もらった金額
		int y=(N/15)*200;
    		// 出力
    		System.out.println(x-y);
    	}
    }