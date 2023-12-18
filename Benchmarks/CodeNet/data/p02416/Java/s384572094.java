import java.util.Scanner;

class Main {
  public static void main(String args[]) {
	  	Scanner scanner = new Scanner(System.in);
	  	int num = 0;
	  	int sum;
	  	int dig;
  		boolean end = false;
  		int count = 0;
  		
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
			if(count == 0){
				System.out.print(sum);
			}else{
				System.out.print("\n" + sum);
			}
			count ++;
		}
		scanner.close();
  }
}
