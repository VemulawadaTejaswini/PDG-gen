import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	//参加人数
		int n = sc.nextInt();
      	//初期の持ち点
      	int k = sc.nextInt();
      	//回数
      	int q = sc.nextInt();
		// n人それぞれの最初の持ち点を格納する
      	int[] point = new int[n];
        for(int i=0;i<point.length;++i){
            point[i] = k;
        }
      	//ゲーム
      	while(sc.hasNext()){
           //正解者
          int a = sc.nextInt();
          int w = a-1;
          //正解者に１足す
          point[w]+=1;
        }
          //全員に１引く
          for(int i=0;i<point.length;++i){
             point[i] -= q;
          //勝敗判断
         	if(point[i]> 0){
            	System.out.println("Yes");
          	}else{
            	System.out.println("No");           
          	}
          }
    }
}