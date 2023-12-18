import java.util.Scanner;

class Main {
  public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		double pos_p1x = scanner.nextDouble();	//座標の入力
		double pos_p1y = scanner.nextDouble();	//座標の入力
		double pos_p2x = scanner.nextDouble();	//座標の入力
		double pos_p2y = scanner.nextDouble();	//座標の入力
  		double root = 0.d;				//距離
  		double pos_x = 0;
  		double pos_y = 0;
  		
  		pos_x = (pos_p2x - pos_p1x);
  		pos_x *= pos_x;
  		pos_y = (pos_p2y - pos_p1y);
  		pos_y *= pos_y;
  		
  		if(( pos_x + pos_y ) != 0) {
  			root = Math.sqrt( ( pos_x + pos_y ) );
  		}
  		//結果出力
		System.out.println(root);
		
		
		scanner.close();
  }
}
