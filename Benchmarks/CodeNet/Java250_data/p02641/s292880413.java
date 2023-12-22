import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
      
      //入力
      int x =sc.nextInt();//整数
      int n =sc.nextInt();//数列の長さ
      int ans = 0;
      int min = 100;
      
      //数列listの空箱用意
      List<Integer> s = new ArrayList<Integer>();
      
      //数列のlist作成
      for(int i =0; i<n; i++){
      		s.add(sc.nextInt());
      } 
      //数列がないとき
		if(n == 0 || !(s.contains(x))) {
			System.out.println(x);
		}
      
      	else {
			for(int i =0; i<=200; i++) {
                //数列に含まれていない整数か
				if(!(s.contains(i))) {
                    //絶対値が小さい整数を求める
					if(Math.abs(x - i) < min) {
                        //最小値を更新する
						min = Math.abs(x - i);
						ans = i;
                    }
                }
            }
          System.out.println(ans);
        }
    }
}