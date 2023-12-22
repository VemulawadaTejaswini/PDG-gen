import java.util.Scanner;
public class Main{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(); //ドーナツの種類の数
    int X = sc.nextInt(); //粉の量(グラム)
    int[] m = new int[N]; //それぞれのドーナツに必要な粉の量
    for(int i = 0; i < N; i++){
      m[i] = sc.nextInt();
    }
    int max = 0; //作れる最大個数
    
    //全ドーナツを1個ずつ作ったときの、残りの粉の量を調べる
    //ついでに一番必要な粉の量が少ないドーナツも調べる
    int all1 = 0;
    int min = X;
    for(int i=0; i<N; i++){
      all1 += m[i];
      if( m[i] < min) min = m[i];
    }
    X = X - all1;
    
    //残った粉で何個作れるかを調べる
    int count = N;
    while(X - min >= 0){
    	count++;
      X -= min;
    }
    
    System.out.println(count);
    
  }
}


