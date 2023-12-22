import static java.lang.Math.*;

import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = null;
		try{
			scan = new Scanner(System.in);
			while(true){
				int n = scan.nextInt();
				if(n == 0)break;
				int[] data = new int[n];
				for(int i = 0 ; i < data.length;i++){
					data[i] = scan.nextInt();
				}
				double ave = ave(data);
				double alpha = 0;
				for(int i = 0 ; i < n;i++){
					alpha += pow((data[i] - ave),2) / n;
				}
				alpha =Math.sqrt(alpha);
				System.out.println(alpha);
			}
		}finally{
			if(scan!=null)scan.close();
		}
	}
	public static double ave (int [] data){
		double sum = 0;
		for(int i = 0 ; i < data.length;i++){
			sum += data[i];
		}
		return sum / data.length;
	}
}