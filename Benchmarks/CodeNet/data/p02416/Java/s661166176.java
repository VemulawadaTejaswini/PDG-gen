import java.util.Scanner;

class Main {
  public static void main(String args[]) {
	  	Scanner scanner = new Scanner(System.in);
	  	int num = 0;
	  	int sum;
	  	int dig;
  		boolean end = false;
  		
  		while( !end ){
			num = scanner.nextInt();	//入力
			sum = 0;					//初期化
			//終了判定したい場所
			if( num == 0 ){
				end = true;
			}
			//各桁を足す処理
			while(num > 0.1){
				dig = num % 10;
				sum = sum + dig;
				num = num / 10;
			}
			//出力
			System.out.println(sum);
			
		}
		scanner.close();
  }
}
