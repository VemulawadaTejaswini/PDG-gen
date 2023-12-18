import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		// スペース区切りの整数の入力
		ArrayList<Integer> array = new ArrayList<Integer>();
		for(int i = 1;i<=a;i++){
			int b = sc.nextInt();
			array.add(b);
		}
		int ans = 1;

		boolean undefined = true;
		boolean upper = true;




		int former,latter;

		for(int i = 0;i<=a-2;i++){
			former = array.get(i);
			latter = array.get(i+1);
			if(undefined){
				if(latter - former > 0){
					upper = true;
					undefined = false;
				}else if(latter - former < 0){
					upper = false;
					undefined = false;
				}
			}else{
				if(upper){
					if(latter - former < 0){
						ans++;
						undefined = true;
					}
				}else{
					if(latter - former > 0){
						ans++;
						undefined = true;
					}
				}
			}

		}




		// 出力
		System.out.println(ans);
	}
}