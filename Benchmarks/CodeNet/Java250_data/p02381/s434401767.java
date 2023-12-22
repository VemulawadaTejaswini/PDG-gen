//10-C
/*
 n 人の学生を含むクラスでプログラミングの試験を行った。それぞれの得点をs1, s2 ... snとしたときの、標準偏差を求めるプログラムを作成せよ。

得点の平均値をｍとすれば、分散α2は以下の式で得られる：



分散の正の平方根が標準偏差αとなる。 
*/

import java.util.Scanner;

class Main {
    public static void main(String [] args){
         
        Scanner sc = new Scanner(System.in);
        
        while(true){
        	
        	int n = sc.nextInt();
        	
        	double[] db = new double[n];
        	
        	double sum = 0;//合計用
        	double m = 0;//平均
        	
        	if( n == 0 ){
        		break;
        	}
        	
        	//平均計算
        	for(int i = 0 ; i < n ; i++ ){
        		
        		double s = sc.nextDouble();
        		
        		db[i] = s;
        		
        		sum = sum + s;
        		
        	}
        	
        	m = sum / n;//平均値代入
        	
        	double sum2 = 0;
        	
        	for(int i = 0 ; i < db.length ; i++ ){
        		
        		db[i] = (db[i] - m) * (db[i] - m);
        		
        		sum2 = sum2 + db[i];
        		
        	}
        	
        	double a = Math.sqrt(sum2 / n);
        	
        	System.out.println(a);
        	
        }
    }
}