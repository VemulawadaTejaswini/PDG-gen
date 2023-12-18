import java.io.*;
import java.util.*;
public class Main{
	public static void main(String args[]) throws Exception{
		Scanner cin= new Scanner(System.in);
		int N= cin.nextInt();
		
		int min= (int)Math.pow(10d,9d);
		int MaxProfit= -min;
		int Rate;
		
		int i;
		for(i=0;i<N;i++){
			Rate= cin.nextInt();
			if(i==0){
				min= Rate;
			}
			else{
				if( Rate-min > MaxProfit ){
					MaxProfit= Rate-min;
				}
				if( Rate<min ){
					min= Rate;
				}
			}
		}
		System.out.println(MaxProfit);
	}
}