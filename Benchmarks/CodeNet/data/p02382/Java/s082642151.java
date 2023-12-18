import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int  num = scanner.nextInt();	//要素数
		double array_x[] = new double[num];
		double array_y[] = new double[num];
		double max = 0;
		double dif;
		double abs;
		double pow;
		double sum = 0;
		double sum_min[] = new double[5];
		
		//xの要素
		for(int i = 0 ; i < num ; i ++){
			array_x[i] = scanner.nextDouble();
		}
		//yの要素
		for(int i = 0 ; i < num ; i ++){
			array_y[i] = scanner.nextDouble();
		}
		
		////距離を求める
		//３まで
		for(int i = 1; i < 4 ; i++ ){
			for( int j = 0; j < num ; j ++ ){
				dif = ( array_x[j] - array_y[j] );
				abs = Math.abs(dif);
				pow = Math.pow(abs, i);
				sum += pow;
				
				if( max < abs ){
					max = abs;
				}
			}
			double man = (double)i;
			sum_min[i] = Math.pow(sum, 1/man);
			sum = 0;
		}
		sum_min[4] = max;
		
		for(int i = 1 ; i <= 4 ; i ++){
			System.out.println(sum_min[i]);
		}
		
		scanner.close();
	}
}

