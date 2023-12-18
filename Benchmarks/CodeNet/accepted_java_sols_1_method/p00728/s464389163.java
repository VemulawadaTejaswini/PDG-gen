import java.util.Scanner;

public class Main{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int  n = sc.nextInt();
			if(n == 0)break;
			int [] Point = new int [n];
			int max = -1, min = 10000000;
			int sum = 0;
			int av = 0;
			for(int i=0;i<n;i++){
				Point[i] = sc.nextInt();
				if(Point[i] >= max){
					max = Point[i];
				}
				if(Point[i] <= min){
					min = Point[i];
				}
				sum = sum + Point[i];
			}
			sum = sum -max -min;
			av =  sum/(n-2);
			System.out.println(av);
		}
	}
}