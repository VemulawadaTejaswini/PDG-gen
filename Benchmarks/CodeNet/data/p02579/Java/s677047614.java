import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // height
        int h = sc.nextInt();

        // width
        int w = sc.nextInt();
      
      	//start
      	int h_C =sc.nextInt();
      	int w_C =sc.nextInt();
      
     	//goal
      	int h_D =sc.nextInt();
      	int w_D =sc.nextInt();
      
      	int result =0;//到達できないときは-1
      	boolean next=false;//終了時にtrueに

        // マス目の状態
        char[][] masu = new char[h+4][w+4];

        // 移動マスQueueを準備
        Deque<XY> p = new ArrayDeque<>();
      	// 移動マスの一時的な保管場所
      	Deque<XY> q = new ArrayDeque<>();
      

      
        // 入力を受け取る
      	for(int i=0;i<h+4;i++){
          for(int j=0;j<w+4;j++){
            masu[i][j]='#';//場外は壁
          }
        }
      
      	for(int i=2;i<h+2;i++){
          String input = sc.next();
          for(int j=2;j<w+2;j++){
            if(input.charAt(j-2)=='#'){
              masu[i][j]='#';//壁
            }
            if(input.charAt(j-2)=='.'){
              masu[i][j]='.';//まだたどり着いてない道
            }
          }
        }
      
      	//masuの確認
     	/*
      	for(int i=0;i<h+4;i++){
          for(int j=0;j<w+3;j++){
            System.out.print(masu[i][j]);
          }
          System.out.println(masu[i][w+3]);
        }
 	 	*/
  

      
      	p.add(new XY(h_C+1,w_C+1,0));//スタート
      	while(next==false){
          if(p.size()<1 && q.size()<1){
            result=-1;//到達できない時用
            next=true;
            //System.out.println("到達できませんでした");
            break;
          }
          
          for (;;) {
              // 無限ループ開始
              //depth回目の移動を網羅
            
              if(p.size()<1){
                break;
              }

              XY xy = p.poll();
              int x = xy.x;
              int y = xy.y;
              int depth = xy.depth;
              masu[y][x]='0';//到達した場所を0に
              q.add(new XY(y,x,depth));



              // 現在の位置の周囲を黒にする
              if (masu[y][x+1] == '.') {
                  // 右マス
                  masu[y][x+1] = '0';//使用済みマス
                  p.add(new XY(y,x+1,depth));
              }
              if (masu[y][x-1] == '.') {
                  // 左マス
                  masu[y][x-1] = '0';//使用済みマス
                  p.add(new XY(y,x-1,depth));
              }
              if (masu[y+1][x] == '.') {
                  // 下マス
                  masu[y+1][x] = '0';//使用済みマス
                  p.add(new XY(y+1,x,depth));
              }
              if (masu[y-1][x] == '.') {
                  // 上マス
                  masu[y-1][x] = '0';//使用済みマス
                  p.add(new XY(y-1,x,depth));
              }

          }


          for (;;) {
              // 無限ループ開始
              //depth+1回目のワープ先を網羅
              if(q.size()<1){
                break;
              }

              XY xy = q.poll();
              int x = xy.x;
              int y = xy.y;
              int depth = xy.depth;

              if((x==w_D+1) && (y== h_D+1)){//到達
                result=depth;
                next=true;
                break;
              }

              for(int i=x-2;i<x+3;i++){//ワープ可能な場所探し
                for(int j=y-2;j<y+3;j++){
                  if(masu[j][i]=='.'){
                    p.add(new XY(j,i,depth+1));
                    //System.out.println((depth+1)+"回目のワープ"+x+","+y+"から"+ i+","+j+"にワープ");
                  }
                }
              }

          }
        }
      //masuの確認
      /*
      System.out.println("ワープごのマスは");
      for(int i=0;i<h+4;i++){
        for(int j=0;j<w+3;j++){
          System.out.print(masu[i][j]);
        }
        System.out.println(masu[i][w+3]);
      }
      */
      
  
	System.out.println(result);

    }
}

class XY {
    int y;
    int x;

    int depth;

    XY(int y, int x, int d) {
        this.x = x;
        this.y = y;
        depth = d;
    }
}
      
      
      
    